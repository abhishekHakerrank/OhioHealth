/**
 * 
 */
package com.ohiohealth.provider.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ohiohealth.provider.controller.model.GetPatientsListsResponse;
import com.ohiohealth.provider.controller.model.PatientListResponse;

/**
 * @author photonuser
 *
 */
@Service
public class PatientDetailService {
	
	@Value("${ohiohealth.endpoint.patient-list}")
	private String endpoint;
	@Value("${ohiohealth.endpoint.patient-details}")
	private String endpoint_patient_details;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private PatientListResponse pListResponse;	
	
	private List<PatientListResponse> patientListResponse; 
	
	private GetPatientsListsResponse getPatientsListsResponse;
	
    public List<PatientListResponse> getPatientListsDetails(String providerID, String providerIDType) {
		
		 getPatientsListsResponse = restTemplate.exchange((UriComponentsBuilder.fromHttpUrl(endpoint)
				.queryParam("providerID", providerID)
				.queryParam("providerIDType", providerIDType)).toUriString(), HttpMethod.GET, null,
				GetPatientsListsResponse.class).getBody();
		 patientListResponse = new ArrayList<PatientListResponse>(); 
		for(int i = 0; i<getPatientsListsResponse.getData().size();i++) {
			if(!getPatientsListsResponse.getData().get(i).getType().isEmpty() && !getPatientsListsResponse.getData().get(i).getId().isEmpty() && getPatientsListsResponse.getData().get(i).getType() !=null && getPatientsListsResponse.getData().get(i).getId() !=null) {
			pListResponse = restTemplate.exchange((UriComponentsBuilder.fromHttpUrl(endpoint_patient_details)
				.queryParam("providerID", providerID)
				.queryParam("providerIDType", providerIDType)
				.queryParam("PatientListID", getPatientsListsResponse.getData().get(i).getId())
				.queryParam("PatientListIDType", getPatientsListsResponse.getData().get(i).getType())).toUriString(), HttpMethod.GET, null,PatientListResponse.class).getBody(); 
			if(null != pListResponse.getData().getPatients() && pListResponse.getData().getPatients().size()>0) {
				patientListResponse.add(pListResponse);
			}
		}
		}
		return patientListResponse;
	}
    

	

}

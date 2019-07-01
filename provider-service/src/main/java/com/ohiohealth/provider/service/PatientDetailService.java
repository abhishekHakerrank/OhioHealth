/**
 * 
 */
package com.ohiohealth.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ohiohealth.provider.controller.model.GetPatientsListsResponse;
import com.ohiohealth.provider.controller.model.PatientListResponse;

/**
 * @author abhishekjena
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
	
	private GetPatientsListsResponse getPatientsListsResponse;
	
    public PatientListResponse getPatientListDetails(String providerID, String providerIDType) {
		
		System.out.println("inside service layer"+providerID + "----"+providerIDType);
		 getPatientsListsResponse = restTemplate.exchange((UriComponentsBuilder.fromHttpUrl(endpoint)
				.queryParam("providerID", providerID)
				.queryParam("providerIDType", providerIDType)).toUriString(), HttpMethod.GET, null,
				GetPatientsListsResponse.class).getBody();
		 System.out.println("getPatientsListsResponse"+getPatientsListsResponse);
		for(int i = 0; i<getPatientsListsResponse.getData().size();i++) {
			pListResponse = restTemplate.exchange((UriComponentsBuilder.fromHttpUrl(endpoint_patient_details)
				.queryParam("providerID", providerID)
				.queryParam("providerIDType", providerIDType)
				.queryParam("PatientListID", getPatientsListsResponse.getData().get(i).getId())
				.queryParam("PatientListIDType", getPatientsListsResponse.getData().get(i).getType())).toUriString(), HttpMethod.GET, null,PatientListResponse.class).getBody(); 
		}
		System.out.println(pListResponse);
		return pListResponse;
	}

	

}

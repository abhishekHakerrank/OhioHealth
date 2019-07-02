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

import com.ohiohealth.provider.model.ListPatientDetailsRes;
import com.ohiohealth.provider.model.ListPatientIDsRes;
import com.ohiohealth.provider.model.Patient;
import com.ohiohealth.provider.model.PatientID;
import com.ohiohealth.provider.model.PatientsRes;

/**
 * @author photonuser
 *
 */
@Service
public class ListPatientsService {

	@Value("${ohiohealth.endpoint.patient-list}")
	private String endpoint;

	@Value("${ohiohealth.endpoint.patient-details}")
	private String endpoint_patient_details;

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Service to return the list of patients for a provider
	 * 
	 * @param providerID
	 * @param providerIDType
	 * @return PatientsRes
	 */
	public PatientsRes listPatients(String providerID, String providerIDType) {
		List<Patient> patientdetails = new ArrayList<>();
		ListPatientIDsRes listPatientsSvcRes = restTemplate.exchange(
				(UriComponentsBuilder.fromHttpUrl(endpoint).queryParam("providerID", providerID)
						.queryParam("providerIDType", providerIDType)).toUriString(),
				HttpMethod.GET, null, ListPatientIDsRes.class).getBody();
		List<PatientID> patientIDInfos = listPatientsSvcRes.getData();
		if (null != patientIDInfos) {
			patientIDInfos.stream().forEach(patientIDInfo -> {
				ListPatientDetailsRes listPatientDetailsSvcRes = restTemplate.exchange(
						(UriComponentsBuilder.fromHttpUrl(endpoint_patient_details).queryParam("providerID", providerID)
								.queryParam("providerIDType", providerIDType)
								.queryParam("PatientListID", patientIDInfo.getId())
								.queryParam("PatientListIDType", patientIDInfo.getType())).toUriString(),
						HttpMethod.GET, null, ListPatientDetailsRes.class).getBody();
				PatientsRes data = listPatientDetailsSvcRes.getData();
				if (null != data && null != data.getPatients() && data.getPatients().size() > 0) {
					patientdetails.addAll(data.getPatients());
				}
			});
		}
		return new PatientsRes(patientdetails);
	}
}

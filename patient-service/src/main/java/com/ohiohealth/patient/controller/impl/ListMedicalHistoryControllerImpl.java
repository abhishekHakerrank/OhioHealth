/**
 * 
 */
package com.ohiohealth.patient.controller.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ohiohealth.patient.controller.ListMedicalHistoryController;
import com.ohiohealth.patient.controller.model.ListMedicalHistoryReq;
import com.ohiohealth.patient.controller.model.ListMedicalHistoryRes;
import com.ohiohealth.patient.controller.model.MedicalHistory;

/**
 * @author photonuser
 *
 */
@Component
public class ListMedicalHistoryControllerImpl implements ListMedicalHistoryController {

	@Value("${ohiohealth.api.header.epic-client-id}")
	private String epicClientId;

	@Value("${ohiohealth.api.header.authorization}")
	private String authorization;

	@Value("${ohiohealth.api.header.content-type}")
	private String contentType;

	@Value("${ohiohealth.api.header.x-api-key}")
	private String xApiKey;
	
	@Value("${ohiohealth.endpoint.mock-medical-history-list}")
	private String mockEndpoint;

	/*@Value("${ohiohealth.endpoint.medical-history-list}")
	private String endpoint;*/
	//private String endpoint = "http://vulpix-dev:85/api/epic/2010/Clinical/Patient/GETMEDICALHISTORY/MedicalHistory";

	@Override
	public ListMedicalHistoryRes listMedicalHistory(ListMedicalHistoryReq listMedicalHistoryReq) {
		final HttpHeaders headers = new HttpHeaders();
		headers.set("Epic-Client-ID", "2a4a7c7f-19c6-4ca0-b605-5934b8a25d48");
		headers.set("Authorization", "Basic ZW1wJE1PQklMRUlOVDo1REtKdEtnZC9sblRFeA==");
		headers.set("Content-Type", "application/json");
		headers.set("X-API-key", "a2f39057-08a7-40f2-a855-ae94e72fd3d7");
		final HttpEntity<String> entity = new HttpEntity<String>(headers);
		RestTemplate restTemplate = new RestTemplate();
		/*UriComponentsBuilder uBuilder = UriComponentsBuilder.fromHttpUrl(endpoint).queryParam("PatientID", listMedicalHistoryReq.getPatientId())
				.queryParam("PatientIDType", listMedicalHistoryReq.getPatientIdType());
		ResponseEntity<Object> response = restTemplate.exchange(
				uBuilder.toUriString(), HttpMethod.GET, entity,
				Object.class);*/
		
		/*ResponseEntity<Object> response = restTemplate.exchange(
				mockEndpoint, HttpMethod.GET, entity,
				Object.class);
		System.out.println(response.getBody().toString());
		return response.getBody();*/
		return ListMedicalHistoryControllerImpl.mockData();
	}

	/*private UriComponentsBuilder buildUriBuilder(ListMedicalHistoryReq listMedicalHistoryReq) {
		return UriComponentsBuilder.fromHttpUrl(endpoint).queryParam("patientID", listMedicalHistoryReq.getPatientId())
				.queryParam("patientIDType", listMedicalHistoryReq.getPatientIdType());
	}*/

	private static ListMedicalHistoryRes mockData() {
		List<MedicalHistory> medicalHistory = new ArrayList<>();
		medicalHistory.add(new MedicalHistory("122", "abc", null, null, "unknown", "leg pain", "leg pain", "1212", "sssss"));
		return new ListMedicalHistoryRes(medicalHistory,null);
	}
}

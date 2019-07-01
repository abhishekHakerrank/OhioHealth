/**
 * 
 */
package com.ohiohealth.patient.controller.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ohiohealth.patient.controller.PatientDemographicsController;
import com.ohiohealth.patient.controller.model.PatientDemographicsReq;
import com.ohiohealth.patient.controller.model.PatientDemographicsRes;

/**
 * @author photonuser
 *
 */
@Component
public class PatientDemographicsControllerImpl implements PatientDemographicsController {

	@Value("${ohiohealth.endpoint.patient-demographics}")
	private String endpoint;
	
	@Value("${ohiohealth.api.params.patientId}")
	private String paramPatientId;
	
	@Value("${ohiohealth.api.params.patientIdType}")
	private String paramIdType;

	@Override
	public PatientDemographicsRes getPatientDemographics(@Valid PatientDemographicsReq patientDemographicsReq) {
		final HttpHeaders headers = new HttpHeaders();
		/*headers.set("Epic-Client-ID", "2a4a7c7f-19c6-4ca0-b605-5934b8a25d48");
		headers.set("Authorization", "Basic ZW1wJE1PQklMRUlOVDo1REtKdEtnZC9sblRFeA==");
		headers.set("Content-Type", "application/json");
		headers.set("X-API-key", "a2f39057-08a7-40f2-a855-ae94e72fd3d7");*/
		final HttpEntity<String> entity = new HttpEntity<String>(headers);
		RestTemplate restTemplate = new RestTemplate();
		UriComponentsBuilder uBuilder = UriComponentsBuilder.fromHttpUrl(endpoint)
				.queryParam(paramPatientId, patientDemographicsReq.getPatientId())
				.queryParam(paramIdType, patientDemographicsReq.getPatientIdType());
		ResponseEntity<PatientDemographicsRes> response = restTemplate.exchange(uBuilder.toUriString(), HttpMethod.GET, entity,
				PatientDemographicsRes.class);
		PatientDemographicsRes patientDemographicsRes = response.getBody();
		return patientDemographicsRes;
	}
}

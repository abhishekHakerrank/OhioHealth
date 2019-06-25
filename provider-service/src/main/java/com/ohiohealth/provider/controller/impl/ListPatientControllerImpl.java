/**
 * 
 */
package com.ohiohealth.provider.controller.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ohiohealth.provider.controller.ListPatientController;
import com.ohiohealth.provider.controller.model.ListPatientReq;
import com.ohiohealth.provider.controller.model.ListPatientRes;

/**
 * @author photonuser
 *
 */
@Component
public class ListPatientControllerImpl implements ListPatientController {

	@Value("${ohiohealth.api.header.epic-client-id}")
	private String epicClientId;

	@Value("${ohiohealth.api.header.authorization}")
	private String authorization;

	@Value("${ohiohealth.api.header.content-type}")
	private String contentType;

	@Value("${ohiohealth.api.header.x-api-key}")
	private String xApiKey;

	@Value("${ohiohealth.endpoint.patient-list}")
	private String endpoint;

	@Override
	public ListPatientRes listPatients(ListPatientReq listMyPatientsReq) {
		final HttpHeaders headers = new HttpHeaders();
		headers.set("Epic-Client-ID", epicClientId);
		headers.set("Authorization", authorization);
		headers.set("Content-Type", contentType);
		headers.set("X-API-key", xApiKey);
		final HttpEntity<String> entity = new HttpEntity<String>(headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ListPatientRes> response = restTemplate.exchange(
				buildUriBuilder(listMyPatientsReq).toUriString(), HttpMethod.GET, entity, ListPatientRes.class);
		return response.getBody();
	}

	private UriComponentsBuilder buildUriBuilder(ListPatientReq listMyPatientsReq) {
		return UriComponentsBuilder.fromHttpUrl(endpoint).queryParam("userID", listMyPatientsReq.getUserId())
				.queryParam("userIDType", listMyPatientsReq.getUserIdType())
				.queryParam("maximumPatients", listMyPatientsReq.getMaximumPatients())
				.queryParam("nextIncrementalLoad", listMyPatientsReq.getNextIncrementalLoad())
				.queryParam("sexType", listMyPatientsReq.getSexType())
				.queryParam("sexReturnType", listMyPatientsReq.getSexReturnType());
	}
}

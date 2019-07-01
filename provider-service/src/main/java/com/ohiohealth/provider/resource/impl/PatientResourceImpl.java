/**
 * 
 */
package com.ohiohealth.provider.resource.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ohiohealth.provider.resource.PatientResource;
import com.ohiohealth.provider.resource.model.PatientResponse;

/**
 * @author photonuser
 *
 */
@Component
public class PatientResourceImpl implements PatientResource {

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
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public String getPatients(String providerID, String providerIDType) {
		System.out.println("inside resource implementation");
//		final HttpHeaders headers = new HttpHeaders();
//		headers.set("Epic-Client-ID", epicClientId);
//		headers.set("Authorization", authorization);
//		headers.set("Content-Type", contentType);
//		headers.set("X-API-key", xApiKey);
//		final HttpEntity<String> entity = new HttpEntity<String>(headers);
	//	RestTemplate restTemplate = new RestTemplate();
		String patientResponse = restTemplate.getForObject("http://vulpix-dev:86/api/Provider/GetPatients?providerID=120716&providerIDType=CID", String.class);
		//ResponseEntity<String> response = restTemplate.exchange(buildUriBuilder(providerID,providerIDType).toUriString(), HttpMethod.GET, null, String.class);
		//return response.getBody();
		//return "test successful";
		return patientResponse;
	}

	private UriComponentsBuilder buildUriBuilder(String providerID, String providerIDType) {
		System.out.println("uri builder");
		return UriComponentsBuilder.fromHttpUrl(endpoint).queryParam("providerID", providerID)
				.queryParam("providerIDType", providerIDType);
	}
}

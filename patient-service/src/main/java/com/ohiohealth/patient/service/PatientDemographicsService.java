/**
 * 
 */
package com.ohiohealth.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ohiohealth.patient.service.model.PatientDemographicsSvcReq;
import com.ohiohealth.patient.service.model.PatientDemographicsSvcRes;
import com.ohiohealth.patient.service.model.UpdatePatientDemographicsSvcReq;
import com.ohiohealth.patient.service.model.UpdatePatientDemographicsSvcRes;

/**
 * @author photonuser
 *
 */
@Service
public class PatientDemographicsService {

	@Value("${ohiohealth.endpoint.patient-demographics}")
	private String endpoint;

	@Value("${ohiohealth.api.params.patientId}")
	private String paramPatientId;

	@Value("${ohiohealth.api.params.patientIdType}")
	private String paramIdType;

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Service to get the patient information
	 * 
	 * @param patientDemographicsSvcReq
	 * @return PatientDemographicsSvcRes
	 */
	public PatientDemographicsSvcRes getPatientDemographics(PatientDemographicsSvcReq patientDemographicsSvcReq) {
		UriComponentsBuilder uBuilder = UriComponentsBuilder.fromHttpUrl(endpoint)
				.queryParam(paramPatientId, patientDemographicsSvcReq.getPatientId())
				.queryParam(paramIdType, patientDemographicsSvcReq.getPatientIdType());
		ResponseEntity<PatientDemographicsSvcRes> response = restTemplate.exchange(uBuilder.toUriString(),
				HttpMethod.GET, new HttpEntity<String>(new HttpHeaders()), PatientDemographicsSvcRes.class);
		PatientDemographicsSvcRes patientDemographicsSvcRes = response.getBody();
		return patientDemographicsSvcRes;
	}

	/**
	 * Service to update the patient information
	 * 
	 * @param updatePatientDemographicsSvcReq
	 * @return UpdatePatientDemographicsSvcRes
	 */
	public UpdatePatientDemographicsSvcRes updatePatientDemographics(
			UpdatePatientDemographicsSvcReq updatePatientDemographicsSvcReq) {
		ResponseEntity<UpdatePatientDemographicsSvcRes> response = restTemplate.postForEntity(endpoint,
				updatePatientDemographicsSvcReq, UpdatePatientDemographicsSvcRes.class);
		UpdatePatientDemographicsSvcRes updatePatientDemographicsSvcRes = response.getBody();
		return updatePatientDemographicsSvcRes;
	}

}

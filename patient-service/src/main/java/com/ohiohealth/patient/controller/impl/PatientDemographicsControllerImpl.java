/**
 * 
 */
package com.ohiohealth.patient.controller.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ohiohealth.patient.controller.PatientDemographicsController;
import com.ohiohealth.patient.controller.model.Demographics;
import com.ohiohealth.patient.controller.model.PatientDemographicsReq;
import com.ohiohealth.patient.controller.model.PatientDemographicsRes;
import com.ohiohealth.patient.controller.model.UpdatePatientDemographicsReq;
import com.ohiohealth.patient.controller.model.UpdatePatientDemographicsRes;

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

	@Value("${ohiohealth.api.message.success}")
	private String success;

	@Value("${ohiohealth.api.message.error}")
	private String error;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public PatientDemographicsRes getPatientDemographics(@Valid PatientDemographicsReq patientDemographicsReq) {
		UriComponentsBuilder uBuilder = UriComponentsBuilder.fromHttpUrl(endpoint)
				.queryParam(paramPatientId, patientDemographicsReq.getPatientId())
				.queryParam(paramIdType, patientDemographicsReq.getPatientIdType());
		ResponseEntity<PatientDemographicsRes> response = restTemplate.exchange(uBuilder.toUriString(), HttpMethod.GET,
				new HttpEntity<String>(new HttpHeaders()), PatientDemographicsRes.class);
		PatientDemographicsRes patientDemographicsRes = response.getBody();
		return patientDemographicsRes;
	}

	@Override
	public UpdatePatientDemographicsRes updatePatientDemographics(
			@Valid UpdatePatientDemographicsReq updatePatientDemographicsReq) {
		ResponseEntity<PatientDemographicsRes> response = restTemplate.postForEntity(endpoint,
				updatePatientDemographicsReq, PatientDemographicsRes.class);
		PatientDemographicsRes patientDemographicsRes = response.getBody();
		Demographics demographics = patientDemographicsRes.getDemographics();
		if (patientDemographicsRes != null && demographics != null) {
			return new UpdatePatientDemographicsRes(true, success, null);
		}
		return new UpdatePatientDemographicsRes(false, error, patientDemographicsRes.getError());
	}
}

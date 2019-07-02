
package com.ohiohealth.provider.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ohiohealth.provider.controller.PatientResource;
import com.ohiohealth.provider.controller.model.GetPatientsListsResponse;
import com.ohiohealth.provider.controller.model.ListID;
import com.ohiohealth.provider.controller.model.PatientListResponse;
import com.ohiohealth.provider.service.PatientDetailService;


/**
 * @author photonuser
 *
 */
@Component
public class PatientResourceImpl implements PatientResource {

	@Autowired
	private PatientDetailService patientDetailService;
	@Override
	public PatientListResponse getPatientsLists(String providerID, String providerIDType) {
		
		
		return patientDetailService.getPatientListDetails(providerID,  providerIDType);
	}

	
}

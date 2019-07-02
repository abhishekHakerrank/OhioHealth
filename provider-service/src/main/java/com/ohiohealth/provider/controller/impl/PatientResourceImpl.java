
package com.ohiohealth.provider.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ohiohealth.provider.controller.PatientResource;
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
	public List<PatientListResponse> getPatientsLists(String providerID, String providerIDType) {
		
		
		return patientDetailService.getPatientListsDetails(providerID,  providerIDType);
	}

	
}

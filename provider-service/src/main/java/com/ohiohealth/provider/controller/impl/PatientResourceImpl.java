
package com.ohiohealth.provider.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ohiohealth.provider.controller.PatientResource;
import com.ohiohealth.provider.model.PatientsRes;
import com.ohiohealth.provider.service.ListPatientsService;

/**
 * The Controller to retrieve the list of patients for a provider
 * 
 * @author photonuser
 */
@Component
public class PatientResourceImpl implements PatientResource {

	@Autowired
	private ListPatientsService listPatientService;

	/**
	 * Api to retrieve the list of patients for a provider
	 */
	@Override
	public PatientsRes listPatients(String providerID, String providerIDType) {
		return listPatientService.listPatients(providerID, providerIDType);
	}

}

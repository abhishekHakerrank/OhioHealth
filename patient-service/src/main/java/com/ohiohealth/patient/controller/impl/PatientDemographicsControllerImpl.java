/**
 * 
 */
package com.ohiohealth.patient.controller.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ohiohealth.patient.controller.PatientDemographicsController;
import com.ohiohealth.patient.controller.model.Demographics;
import com.ohiohealth.patient.controller.model.PatientDemographicsReq;
import com.ohiohealth.patient.controller.model.PatientDemographicsRes;
import com.ohiohealth.patient.controller.model.UpdatePatientDemographicsReq;
import com.ohiohealth.patient.controller.model.UpdatePatientDemographicsRes;
import com.ohiohealth.patient.service.PatientDemographicsService;
import com.ohiohealth.patient.service.model.PatientDemographics;
import com.ohiohealth.patient.service.model.PatientDemographicsSvcReq;
import com.ohiohealth.patient.service.model.PatientDemographicsSvcRes;
import com.ohiohealth.patient.service.model.PatientInformation;
import com.ohiohealth.patient.service.model.UpdatePatientDemographicsSvcReq;
import com.ohiohealth.patient.service.model.UpdatePatientDemographicsSvcRes;

/**
 * @author photonuser
 *
 */
@Component
public class PatientDemographicsControllerImpl implements PatientDemographicsController {

	@Value("${ohiohealth.api.message.success}")
	private String success;

	@Value("${ohiohealth.api.message.error}")
	private String error;

	@Autowired
	private PatientDemographicsService patientDemographicsService;

	/**
	 * Api to get patient Information
	 */
	@Override
	public PatientDemographicsRes getPatientDemographics(@Valid PatientDemographicsReq patientDemographicsReq) {
		return PatientDemographicsControllerImpl.format(patientDemographicsService
				.getPatientDemographics(PatientDemographicsControllerImpl.format(patientDemographicsReq)));
	}

	/**
	 * Api to update patient information
	 */
	@Override
	public UpdatePatientDemographicsRes updatePatientDemographics(
			@Valid UpdatePatientDemographicsReq updatePatientDemographicsReq) {
		UpdatePatientDemographicsSvcRes updatePatientDemographicsSvcRes = patientDemographicsService
				.updatePatientDemographics(PatientDemographicsControllerImpl.format(updatePatientDemographicsReq));
		PatientDemographics demographics = updatePatientDemographicsSvcRes.getData();
		if (updatePatientDemographicsSvcRes != null && demographics != null) {
			return new UpdatePatientDemographicsRes(true, success, null);
		}
		return new UpdatePatientDemographicsRes(false, error, updatePatientDemographicsSvcRes.getError());
	}

	/**
	 * Format patient demographics request
	 * 
	 * @param patientDemographicsReq
	 * @return PatientDemographicsSvcReq
	 */
	private static PatientDemographicsSvcReq format(PatientDemographicsReq patientDemographicsReq) {
		return new PatientDemographicsSvcReq(patientDemographicsReq.getPatientId(),
				patientDemographicsReq.getPatientIdType());
	}

	/**
	 * Format patient demographics response
	 * 
	 * @param patientDemographicsSvcRes
	 * @return PatientDemographicsRes
	 */
	private static PatientDemographicsRes format(PatientDemographicsSvcRes patientDemographicsSvcRes) {
		PatientInformation patientInformation = patientDemographicsSvcRes.getData();
		return new PatientDemographicsRes(patientDemographicsSvcRes.isSuccess(),
				new Demographics(patientInformation.getId(), patientInformation.getName(),
						patientInformation.getGender(), patientInformation.getType(),
						patientInformation.getLocationID(), patientInformation.getLocationName(),
						patientInformation.getDateOfBirth(), patientInformation.getContactEmail(),
						patientInformation.getContactPhoneNumber(), patientInformation.getAddress(),
						patientInformation.getCity(), patientInformation.getState(), patientInformation.getZipCode(),
						patientInformation.getMaritalStatus(), patientInformation.getPrimaryPhysicianID(),
						patientInformation.getCountry(), patientInformation.getCounty()),
				patientDemographicsSvcRes.getError());
	}

	/**
	 * Format Update patient demographics request
	 * 
	 * @param updatePatientDemographicsReq
	 * @return UpdatePatientDemographicsSvcReq
	 */
	private static UpdatePatientDemographicsSvcReq format(UpdatePatientDemographicsReq updatePatientDemographicsReq) {
		return new UpdatePatientDemographicsSvcReq(updatePatientDemographicsReq.getPatientID(),
				updatePatientDemographicsReq.getPatientIDType(), updatePatientDemographicsReq.getContactEmail(),
				updatePatientDemographicsReq.getContactPhoneNumber(), updatePatientDemographicsReq.getAddress(),
				updatePatientDemographicsReq.getCity(), updatePatientDemographicsReq.getState(),
				updatePatientDemographicsReq.getCountry(), updatePatientDemographicsReq.getCounty());
	}

}

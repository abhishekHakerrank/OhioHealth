/**
 * 
 */
package com.ohiohealth.patient.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ohiohealth.patient.controller.model.PatientDemographicsReq;
import com.ohiohealth.patient.controller.model.PatientDemographicsRes;
import com.ohiohealth.patient.controller.model.UpdatePatientDemographicsReq;
import com.ohiohealth.patient.controller.model.UpdatePatientDemographicsRes;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Controller for patient demographics information
 * @author photonuser
 */
@RestController
@Api(value = "Controller for patient demographics information")
public interface PatientDemographicsController {

	/**
	 * API to return the patient demographics information
	 * 
	 * @param patientDemographicsReq
	 * @return PatientDemographicsRes
	 */
	@ApiOperation(value = "Get patient demographics", response = PatientDemographicsRes.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved patient demographics", response = PatientDemographicsRes.class),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping(value = "/patient/demographics", produces = "application/json")
	public PatientDemographicsRes getPatientDemographics(@Valid PatientDemographicsReq patientDemographicsReq);

	/**
	 * API to update the patient demographic information
	 * 
	 * @param updatePatientDemographicsReq
	 * @return UpdatePatientDemographicsRes
	 */
	@ApiOperation(value = "Update patient demographics", response = PatientDemographicsRes.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully updated patient demographics", response = UpdatePatientDemographicsRes.class),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@PostMapping(value = "/patient/demographics", produces = "application/json")
	public UpdatePatientDemographicsRes updatePatientDemographics(
			@RequestBody @Valid UpdatePatientDemographicsReq updatePatientDemographicsReq);

}

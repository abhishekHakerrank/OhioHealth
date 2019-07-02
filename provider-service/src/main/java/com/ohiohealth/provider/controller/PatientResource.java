/**
 * 
 */
package com.ohiohealth.provider.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ohiohealth.provider.model.PatientsRes;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author photonuser
 *
 */
@RestController
@Api(value = "Patient Resources")
public interface PatientResource {

	@ApiOperation(value = "List of patients", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list", response = PatientsRes.class ),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping(value = "/providers/{providerID}/providerIDType/{providerIDType}/patients", produces = "application/json")
	public PatientsRes listPatients(@PathVariable String providerID, @PathVariable String providerIDType);
}

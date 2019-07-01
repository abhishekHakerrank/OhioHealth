/**
 * 
 */
package com.ohiohealth.provider.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ohiohealth.provider.resource.model.PatientResponse;

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
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping(value = "/providers/{providerID}/providerIDType/{providerIDType}/patients", produces = "application/json")
	public String getPatients(String providerID, String providerIDType);

}

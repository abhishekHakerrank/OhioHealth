/**
 * 
 */
package com.ohiohealth.provider.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ohiohealth.provider.controller.model.ListPatientReq;
import com.ohiohealth.provider.controller.model.ListPatientRes;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author photonuser
 *
 */
@RestController
@Api(value = "List Patient controller")
public interface ListPatientController {

	@ApiOperation(value = "List of patients", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping(value = "/patient/list", produces = "application/json")
	public ListPatientRes listPatients(@Valid ListPatientReq listMyPatientsReq);

}

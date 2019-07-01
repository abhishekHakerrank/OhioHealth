/**
 * 
 */
package com.ohiohealth.patient.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ohiohealth.patient.controller.model.ListMedicalHistoryReq;
import com.ohiohealth.patient.controller.model.ListMedicalHistoryRes;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author photonuser
 *
 */
@RestController
@Api(value = "List Patient's Medical History controller")
public interface ListMedicalHistoryController {
	
	@ApiOperation(value = "List patient medical history", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list",response = ListMedicalHistoryRes.class),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping(value = "/api/patient/medicalhistory/list", produces = "application/json")
	public Object listMedicalHistory(@Valid ListMedicalHistoryReq listMedicalHistoryReq);

}

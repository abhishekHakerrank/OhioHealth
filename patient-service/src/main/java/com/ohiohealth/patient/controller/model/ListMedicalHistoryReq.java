/**
 * 
 */
package com.ohiohealth.patient.controller.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author photonuser
 *
 */
@ApiModel(description = "The patient medical history list request")
public class ListMedicalHistoryReq implements Serializable {

	private static final long serialVersionUID = 3110428507504034203L;

	@NotNull
	@ApiModelProperty(notes="The patient ID", value="patientId", example="67576")
	private String patientId;
	
	@NotNull
	@ApiModelProperty(notes="Type for provider IP (Internal,External,CID,Identity ID Type Descriptor(I IIT 600), NationalID, CSN or FHIR)", value="patientIdType", example="External")
	private String patientIdType;

	/**
	 * @param patientId
	 * @param patientIdType
	 */
	public ListMedicalHistoryReq(String patientId, String patientIdType) {
		this.patientId = patientId;
		this.patientIdType = patientIdType;
	}

	/**
	 * @return the patientId
	 */
	public String getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the patientIdType
	 */
	public String getPatientIdType() {
		return patientIdType;
	}

	/**
	 * @param patientIdType the patientIdType to set
	 */
	public void setPatientIdType(String patientIdType) {
		this.patientIdType = patientIdType;
	}
}

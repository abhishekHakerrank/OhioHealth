/**
 * 
 */
package com.ohiohealth.provider.controller.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author photonuser
 *
 */
public class PatientID implements Serializable {

	private static final long serialVersionUID = 5753262616507245075L;

	@ApiModelProperty(notes = "The Patient ID", value="patientId")
	private String patientId;
	
	@ApiModelProperty(notes = "The Patient ID Type", value="patientIdType")
	private String patientIdType;

	/**
	 * @param patientId
	 * @param patientIdType
	 */
	public PatientID(String patientId, String patientIdType) {
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

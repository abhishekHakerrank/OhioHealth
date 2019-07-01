/**
 * 
 */
package com.ohiohealth.patient.controller.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author photonuser
 *
 */
@ApiModel(description = "The patient demographics response")
public class PatientDemographicsRes implements Serializable {

	private static final long serialVersionUID = 6110349908892627511L;

	@ApiModelProperty(notes="isSuccess", value="isSuccess")
	private boolean isSuccess;
	
	@ApiModelProperty(notes="The patient demographics", value="demographics")
	@JsonProperty(value="data")
	private Demographics demographics;
	
	@ApiModelProperty(notes="error", value="error")
	private String error;

	/**
	 * @param isSuccess
	 * @param demographics
	 * @param error
	 */
	public PatientDemographicsRes(boolean isSuccess, Demographics demographics, String error) {
		this.isSuccess = isSuccess;
		this.demographics = demographics;
		this.error = error;
	}

	public PatientDemographicsRes() {
	}

	/**
	 * @return the isSuccess
	 */
	public boolean isSuccess() {
		return isSuccess;
	}

	/**
	 * @param isSuccess the isSuccess to set
	 */
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	/**
	 * @return the demographics
	 */
	public Demographics getDemographics() {
		return demographics;
	}

	/**
	 * @param demographics the demographics to set
	 */
	public void setDemographics(Demographics demographics) {
		this.demographics = demographics;
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}
}

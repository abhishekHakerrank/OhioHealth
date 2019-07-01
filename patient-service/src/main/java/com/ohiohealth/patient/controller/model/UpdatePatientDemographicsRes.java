/**
 * 
 */
package com.ohiohealth.patient.controller.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author photonuser
 *
 */
public class UpdatePatientDemographicsRes implements Serializable {

	private static final long serialVersionUID = 4142397974701623105L;

	@ApiModelProperty(notes = "isSuccess", value = "isSuccess")
	private boolean isSuccess;

	@ApiModelProperty(notes = "Message", value = "message")
	private String message;

	@ApiModelProperty(notes = "error", value = "error")
	private String error;

	/**
	 * @param isSuccess
	 * @param message
	 * @param error
	 */
	public UpdatePatientDemographicsRes(boolean isSuccess, String message, String error) {
		this.isSuccess = isSuccess;
		this.message = message;
		this.error = error;
	}

	/**
	 * Default Constructor
	 */
	public UpdatePatientDemographicsRes() {
	}

	/**
	 * @return the isSuccess
	 */
	public boolean isSuccess() {
		return isSuccess;
	}

	/**
	 * @param isSuccess
	 *            the isSuccess to set
	 */
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}
}

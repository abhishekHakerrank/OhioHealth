/**
 * 
 */
package com.ohiohealth.provider.controller.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author abhishekjena
 *
 */
public class PatientListResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4390359842043438831L;

	@ApiModelProperty(notes = "List of patiets for a provider", value = "data")
	private ListOfThePatientsForTheProvidersResponse data;

	@ApiModelProperty(notes = "True if the list has been loaded up to the maximum patients value for the iteration or the entire lis loaded. Otherwise false", value = "isSuccess", example = "true")
	private boolean isSuccess;

	@ApiModelProperty(notes = "Any non-fault error details", value = "error")
	private String error;

	public PatientListResponse() {
		super();
	}

	public PatientListResponse(ListOfThePatientsForTheProvidersResponse data, boolean isSuccess, String error) {
		super();
		this.data = data;
		this.isSuccess = isSuccess;
		this.error = error;
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
	public void setisSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
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

	/**
	 * @return the data
	 */
	public ListOfThePatientsForTheProvidersResponse getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(ListOfThePatientsForTheProvidersResponse data) {
		this.data = data;
	}

}

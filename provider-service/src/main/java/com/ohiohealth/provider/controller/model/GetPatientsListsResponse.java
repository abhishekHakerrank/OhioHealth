package com.ohiohealth.provider.controller.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class GetPatientsListsResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6206081300189940007L;
	@ApiModelProperty(notes = "List of patients for a provider", value = "data")
	private List<ListID> data;

	@ApiModelProperty(notes = "True if the list has been loaded up to the maximum patients value for the iteration or the entire lis loaded. Otherwise false", value = "isSuccess", example = "true")
	private boolean isSuccess;

	@ApiModelProperty(notes = "Any non-fault error details", value = "error")
	private String error;

	public GetPatientsListsResponse() {
		super();
	}

	/**
	 * @return the data
	 */
	public List<ListID> getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<ListID> data) {
		this.data = data;
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

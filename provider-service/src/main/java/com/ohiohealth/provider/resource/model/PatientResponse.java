/**
 * 
 */
package com.ohiohealth.provider.resource.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author photonuser
 *
 */
@ApiModel(description = "The patient list response for a provider")
public class PatientResponse implements Serializable{

	private static final long serialVersionUID = 8876178375583966335L;

	@ApiModelProperty(notes = "List of patients for a provider", value="data")
	//@JsonProperty(value="data")
	private List<Patient> patients;

	@ApiModelProperty(notes = "True if the list has been loaded up to the maximum patients value for the iteration or the entire lis loaded. Otherwise false", value="isSuccess", example = "true")
	private boolean isSuccess;
	
	@ApiModelProperty(notes = "Any non-fault error details", value="error")
	private String error;

	/**
	 * @param patients
	 * @param allRecordsLoaded
	 * @param nextIncrementalLoad
	 * @param success
	 * @param error
	 */
	public PatientResponse(List<Patient> patients, boolean isSuccess,String error) {
		this.patients = patients;
		this.isSuccess = isSuccess;
		this.error = error;
	}
	
	public PatientResponse() {
		
	}

	/**
	 * @return the patients
	 */
	public List<Patient> getPatients() {
		return patients;
	}

	/**
	 * @param patients the patients to set
	 */
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	

	/**
	 * @return the isSuccess
	 */
	public boolean isSuccess() {
		return isSuccess;
	}

	/**
	 * @param success the success to set
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
	
}

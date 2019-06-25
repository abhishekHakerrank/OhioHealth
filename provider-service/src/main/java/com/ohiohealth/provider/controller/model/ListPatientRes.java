/**
 * 
 */
package com.ohiohealth.provider.controller.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author photonuser
 *
 */
@ApiModel(description = "The patient list response")
public class ListPatientRes implements Serializable{

	private static final long serialVersionUID = 8876178375583966335L;

	@ApiModelProperty(notes = "List of patients of the user", value="patients")
	private List<Patient> patients;

	@ApiModelProperty(notes = "True if the list has been loaded up to the maximum patients value for the iteration or the entire lis loaded. Otherwise fale", value="allRecordsLoaded", example = "true")
	private boolean allRecordsLoaded;
	
	@ApiModelProperty(notes = "If AllREcordsLoaded is false, this will be populated with a string to use an input for the next incremental load in the NextIncrementalLoad request parameter", value="nextIncrementalLoad")
	private String nextIncrementalLoad;
	
	@ApiModelProperty(notes = "True if no error is returned. Otherwise false. This element can be null if a fault occurs", value="success")
	private boolean success;
	
	@ApiModelProperty(notes = "Any non-fault error details", value="error")
	private String error;

	/**
	 * Default Constructor
	 */
	public ListPatientRes() {
	}

	/**
	 * @param patients
	 * @param allRecordsLoaded
	 * @param nextIncrementalLoad
	 * @param success
	 * @param error
	 */
	public ListPatientRes(List<Patient> patients, boolean allRecordsLoaded, String nextIncrementalLoad, boolean success,
			String error) {
		this.patients = patients;
		this.allRecordsLoaded = allRecordsLoaded;
		this.nextIncrementalLoad = nextIncrementalLoad;
		this.success = success;
		this.error = error;
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
	 * @return the allRecordsLoaded
	 */
	public boolean isAllRecordsLoaded() {
		return allRecordsLoaded;
	}

	/**
	 * @param allRecordsLoaded the allRecordsLoaded to set
	 */
	public void setAllRecordsLoaded(boolean allRecordsLoaded) {
		this.allRecordsLoaded = allRecordsLoaded;
	}

	/**
	 * @return the nextIncrementalLoad
	 */
	public String getNextIncrementalLoad() {
		return nextIncrementalLoad;
	}

	/**
	 * @param nextIncrementalLoad the nextIncrementalLoad to set
	 */
	public void setNextIncrementalLoad(String nextIncrementalLoad) {
		this.nextIncrementalLoad = nextIncrementalLoad;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
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

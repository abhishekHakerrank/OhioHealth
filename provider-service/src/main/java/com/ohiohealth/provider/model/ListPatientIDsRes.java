/**
 * 
 */
package com.ohiohealth.provider.model;

import java.io.Serializable;
import java.util.List;

/**
 * List of Patinet IDs Response
 * 
 * @author photonuser
 *
 */
public class ListPatientIDsRes implements Serializable {

	private static final long serialVersionUID = -6856330253914046279L;

	private boolean isSuccess;
	
	private String error;
	
	private List<PatientID> data;

	/**
	 * @param isSuccess
	 * @param error
	 * @param data
	 */
	public ListPatientIDsRes(boolean isSuccess, String error, List<PatientID> data) {
		this.isSuccess = isSuccess;
		this.error = error;
		this.data = data;
	}

	/**
	 * Default Constructor
	 */
	public ListPatientIDsRes() {
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

	/**
	 * @return the data
	 */
	public List<PatientID> getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<PatientID> data) {
		this.data = data;
	}

}

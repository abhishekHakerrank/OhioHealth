package com.ohiohealth.provider.model;

import java.io.Serializable;

/**
 * Patient Details Response
 * 
 * @author photonuser
 *
 */
public class ListPatientDetailsRes implements Serializable{

	private static final long serialVersionUID = 6577788344892143910L;

	private boolean isSuccess;
	
	private String error;
	
	private PatientsRes data;

	/**
	 * @param isSuccess
	 * @param error
	 * @param data
	 */
	public ListPatientDetailsRes(boolean isSuccess, String error, PatientsRes data) {
		this.isSuccess = isSuccess;
		this.error = error;
		this.data = data;
	}

	/**
	 * Default Constructor
	 */
	public ListPatientDetailsRes() {
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
	public PatientsRes getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(PatientsRes data) {
		this.data = data;
	}

}

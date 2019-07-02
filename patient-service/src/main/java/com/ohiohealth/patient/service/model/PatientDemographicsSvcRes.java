/**
 * 
 */
package com.ohiohealth.patient.service.model;

import java.io.Serializable;

/**
 * @author photonuser
 *
 */
public class PatientDemographicsSvcRes implements Serializable {

	private static final long serialVersionUID = 4460601620383047215L;

	/**
	 * Is the service success
	 */
	private boolean isSuccess;

	/**
	 * The patient information data
	 */
	private PatientInformation data;

	/**
	 * service error
	 */
	private String error;

	/**
	 * @param isSuccess
	 * @param data
	 * @param error
	 */
	public PatientDemographicsSvcRes(boolean isSuccess, PatientInformation data, String error) {
		this.isSuccess = isSuccess;
		this.data = data;
		this.error = error;
	}

	/**
	 * Default Constructor
	 */
	public PatientDemographicsSvcRes() {
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
	 * @return the data
	 */
	public PatientInformation getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(PatientInformation data) {
		this.data = data;
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

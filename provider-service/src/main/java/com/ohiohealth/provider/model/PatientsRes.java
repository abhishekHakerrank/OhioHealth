/**
 * 
 */
package com.ohiohealth.provider.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author photonuser
 *
 */
@ApiModel(description = "The get patient for a provider response")
public class PatientsRes implements Serializable{

	private static final long serialVersionUID = -7381350991095458550L;
	
	/**
	 * the list of patients
	 */
	@ApiModelProperty(notes = "List of patients for a provider", value = "patients")
	private List<Patient> patients;

	/**
	 * @param patients
	 */
	public PatientsRes(List<Patient> patients) {
		this.patients = patients;
	}

	/**
	 * Default Constructor
	 */
	public PatientsRes() {
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
}

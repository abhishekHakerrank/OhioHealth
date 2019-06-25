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
@ApiModel(description = "Patient response")
public class Patient implements Serializable {

	private static final long serialVersionUID = -4775768731641746334L;

	@ApiModelProperty(notes = "The name of the patient, including the preferred name in quotes", value="name")
	private String name;
	
	@ApiModelProperty(notes = "The age of the patient in years", value="age")
	private String age;
	
	@ApiModelProperty(notes = "The category abbreviation from I EPT 130. M is male, F is female, U is unknown and OTH is other", value="sex")
	private String sex;

	@ApiModelProperty(notes = "List of all the current IDs for the patient", value="patientId")
	private List<PatientID> patientId;
	
	/**
	 * Default Constructor
	 */
	public Patient() {
	}

	/**
	 * @param name
	 * @param age
	 * @param sex
	 * @param patientId
	 */
	public Patient(String name, String age, String sex, List<PatientID> patientId) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.patientId = patientId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the patientId
	 */
	public List<PatientID> getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(List<PatientID> patientId) {
		this.patientId = patientId;
	}
	
}

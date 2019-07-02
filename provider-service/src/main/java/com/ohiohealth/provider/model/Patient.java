/**
 * 
 */
package com.ohiohealth.provider.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The patient
 * 
 * @author photonuser
 *
 */
@ApiModel(description = "The patient response")
public class Patient implements Serializable {

	private static final long serialVersionUID = 4347414567271194638L;

	@ApiModelProperty(notes = "The patient ID", value = "patientID")
	private String patientID;

	@ApiModelProperty(notes = "The patient name", value = "patientName")
	private String patientName;

	@ApiModelProperty(notes = "The patient gender", value = "patientGender")
	private String patientGender;

	@ApiModelProperty(notes = "The patient gender", value = "patientAge")
	private String patientAge;

	@ApiModelProperty(notes = "The patient type", value = "patientType")
	private String patientType;

	@ApiModelProperty(notes = "The patient location ID", value = "locationID")
	private String locationID;

	@ApiModelProperty(notes = "The patient location name", value = "locationName")
	private String locationName;

	/**
	 * @param patientID
	 * @param patientName
	 * @param patientGender
	 * @param patientAge
	 * @param patientType
	 * @param locationID
	 * @param locationName
	 */
	public Patient(String patientID, String patientName, String patientGender, String patientAge, String patientType,
			String locationID, String locationName) {
		this.patientID = patientID;
		this.patientName = patientName;
		this.patientGender = patientGender;
		this.patientAge = patientAge;
		this.patientType = patientType;
		this.locationID = locationID;
		this.locationName = locationName;
	}

	/**
	 * Default Constructor
	 */
	public Patient() {
	}

	/**
	 * @return the patientID
	 */
	public String getPatientID() {
		return patientID;
	}

	/**
	 * @param patientID
	 *            the patientID to set
	 */
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * @param patientName
	 *            the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
	 * @return the patientGender
	 */
	public String getPatientGender() {
		return patientGender;
	}

	/**
	 * @param patientGender
	 *            the patientGender to set
	 */
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	/**
	 * @return the patientAge
	 */
	public String getPatientAge() {
		return patientAge;
	}

	/**
	 * @param patientAge
	 *            the patientAge to set
	 */
	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}

	/**
	 * @return the patientType
	 */
	public String getPatientType() {
		return patientType;
	}

	/**
	 * @param patientType
	 *            the patientType to set
	 */
	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}

	/**
	 * @return the locationID
	 */
	public String getLocationID() {
		return locationID;
	}

	/**
	 * @param locationID
	 *            the locationID to set
	 */
	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}

	/**
	 * @return the locationName
	 */
	public String getLocationName() {
		return locationName;
	}

	/**
	 * @param locationName
	 *            the locationName to set
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
}

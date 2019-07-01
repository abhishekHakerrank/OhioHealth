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
/**
 * @author abhishekjena
 *
 */
@ApiModel(description = "Patient response")
public class Patient implements Serializable {

	private static final long serialVersionUID = -4775768731641746334L;

	@ApiModelProperty(notes = "The name of the patient, including the preferred name in quotes", value="patientName")
	private String patientName;
	
	@ApiModelProperty(notes = "The age of the patient in years", value="patientAge")
	private String patientAge;
	
	@ApiModelProperty(notes = "The category abbreviation from I EPT 130. M is male, F is female, U is unknown and OTH is other", value="patientGender")
	private String patientGender;

	@ApiModelProperty(notes = "patientID", value="patientId")
	private String patientId;
	
	@ApiModelProperty(notes = "the type of patient", value="patientType")
	private String patientType;
	
	@ApiModelProperty(notes = "location detail", value="locationID")
	private String locationID;
	
	@ApiModelProperty(notes = "location name", value="locationName")
	private String locationName;

	public Patient(String patientName, String patientAge, String patientGender, String patientId, String patientType,
			String locationID, String locationName) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientId = patientId;
		this.patientType = patientType;
		this.locationID = locationID;
		this.locationName = locationName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientType() {
		return patientType;
	}

	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}

	public String getLocationID() {
		return locationID;
	}

	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
}

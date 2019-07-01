/**
 * 
 */
package com.ohiohealth.patient.controller.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author photonuser
 *
 */
@ApiModel(description = "The patient demographics update request")
public class UpdatePatientDemographicsReq implements Serializable{

	private static final long serialVersionUID = 1793952011629488857L;

	@NotNull
	@ApiModelProperty(notes = "The patient ID", value = "patientID", example = "67576")
	private String patientID;

	@NotNull
	@ApiModelProperty(notes = "The patient Type", value = "patientIDType", example = "External")
	private String patientIDType;
	
	@ApiModelProperty(notes = "The patient contact email", value = "contactEmail", example = "test@gmail.com")
	private String contactEmail;

	@ApiModelProperty(notes = "The patient contact phone number", value = "contactPhoneNumber", example = "5432117867")
	private String contactPhoneNumber;
	
	@ApiModelProperty(notes = "The patient address", value = "address")
	private String address;
	
	@ApiModelProperty(notes = "The patient city", value = "city", example = "lewis center")
	private String city;
	
	@ApiModelProperty(notes = "The patient state", value = "state", example = "ohio")
	private String state;
	
	@ApiModelProperty(notes = "The patient country", value = "state", example = "United States Of America")
	private String country;
	
	@ApiModelProperty(notes = "The patient county", value = "state", example = "Delarware")
	private String county;

	/**
	 * @param patientID
	 * @param patientIDType
	 * @param contactEmail
	 * @param contactPhoneNumber
	 * @param address
	 * @param city
	 * @param state
	 * @param country
	 * @param county
	 */
	public UpdatePatientDemographicsReq(@NotNull String patientID, @NotNull String patientIDType, String contactEmail,
			String contactPhoneNumber, String address, String city, String state, String country, String county) {
		this.patientID = patientID;
		this.patientIDType = patientIDType;
		this.contactEmail = contactEmail;
		this.contactPhoneNumber = contactPhoneNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.county = county;
	}

	/**
	 * Default Constructor
	 */
	public UpdatePatientDemographicsReq() {
	}



	/**
	 * @return the patientID
	 */
	public String getPatientID() {
		return patientID;
	}

	/**
	 * @param patientID the patientID to set
	 */
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	/**
	 * @return the patientIDType
	 */
	public String getPatientIDType() {
		return patientIDType;
	}

	/**
	 * @param patientIDType the patientIDType to set
	 */
	public void setPatientIDType(String patientIDType) {
		this.patientIDType = patientIDType;
	}

	/**
	 * @return the contactEmail
	 */
	public String getContactEmail() {
		return contactEmail;
	}

	/**
	 * @param contactEmail the contactEmail to set
	 */
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	/**
	 * @return the contactPhoneNumber
	 */
	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	/**
	 * @param contactPhoneNumber the contactPhoneNumber to set
	 */
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}

}

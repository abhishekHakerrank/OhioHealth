/**
 * 
 */
package com.ohiohealth.patient.service.model;

import java.io.Serializable;

/**
 * @author photonuser
 *
 */
public class PatientDemographics implements Serializable {

	private static final long serialVersionUID = -6742810540601932027L;

	/**
	 * The patient ID
	 */
	private String patientID;

	/**
	 * The patient ID Type
	 */
	private String patientIDType;

	/**
	 * The patient email
	 */
	private String contactEmail;

	/**
	 * The patient phone number
	 */
	private String contactPhoneNumber;

	/**
	 * The patient address
	 */
	private String address;

	/**
	 * The patient city
	 */
	private String city;

	/**
	 * The patient state
	 */
	private String state;

	/**
	 * The patient country
	 */
	private String country;

	/**
	 * The patient county
	 */
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
	public PatientDemographics(String patientID, String patientIDType, String contactEmail, String contactPhoneNumber,
			String address, String city, String state, String country, String county) {
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
	public PatientDemographics() {
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
	 * @return the patientIDType
	 */
	public String getPatientIDType() {
		return patientIDType;
	}

	/**
	 * @param patientIDType
	 *            the patientIDType to set
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
	 * @param contactEmail
	 *            the contactEmail to set
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
	 * @param contactPhoneNumber
	 *            the contactPhoneNumber to set
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
	 * @param address
	 *            the address to set
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
	 * @param city
	 *            the city to set
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
	 * @param state
	 *            the state to set
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
	 * @param country
	 *            the country to set
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
	 * @param county
	 *            the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}
}

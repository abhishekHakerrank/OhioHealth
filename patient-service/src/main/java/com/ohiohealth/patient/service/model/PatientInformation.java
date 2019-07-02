/**
 * 
 */
package com.ohiohealth.patient.service.model;

import java.io.Serializable;

/**
 * @author photonuser
 *
 */
public class PatientInformation implements Serializable {

	private static final long serialVersionUID = -7154461082972402609L;

	/**
	 * The patient id
	 */
	private String id;

	/**
	 * The patient name
	 */
	private String name;

	/**
	 * The patient gender
	 */
	private String gender;

	/**
	 * The patient type
	 */
	private String type;

	/**
	 * The patient location ID
	 */
	private String locationID;

	/**
	 * The patient location name
	 */
	private String locationName;

	/**
	 * The patient date of birth
	 */
	private String dateOfBirth;

	/**
	 * The patient email
	 */
	private String contactEmail;

	/**
	 * The patient phone number
	 */
	private String contactPhoneNumber;

	/**
	 * The patient street address
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
	 * The patient zip code
	 */
	private String zipCode;

	/**
	 * The patient marital status
	 */
	private String maritalStatus;

	/**
	 * The patient's primary physician ID
	 */
	private String primaryPhysicianID;

	/**
	 * The patient country
	 */
	private String country;

	/**
	 * The patient county
	 */
	private String county;

	/**
	 * @param id
	 * @param name
	 * @param gender
	 * @param type
	 * @param locationID
	 * @param locationName
	 * @param dateOfBirth
	 * @param contactEmail
	 * @param contactPhoneNumber
	 * @param address
	 * @param city
	 * @param state
	 * @param zipCode
	 * @param maritalStatus
	 * @param primaryPhysicianID
	 * @param country
	 * @param county
	 */
	public PatientInformation(String id, String name, String gender, String type, String locationID,
			String locationName, String dateOfBirth, String contactEmail, String contactPhoneNumber, String address,
			String city, String state, String zipCode, String maritalStatus, String primaryPhysicianID, String country,
			String county) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.type = type;
		this.locationID = locationID;
		this.locationName = locationName;
		this.dateOfBirth = dateOfBirth;
		this.contactEmail = contactEmail;
		this.contactPhoneNumber = contactPhoneNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.maritalStatus = maritalStatus;
		this.primaryPhysicianID = primaryPhysicianID;
		this.country = country;
		this.county = county;
	}

	/**
	 * Default Contructor
	 */
	public PatientInformation() {
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
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

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 *            the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the maritalStatus
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * @param maritalStatus
	 *            the maritalStatus to set
	 */
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	/**
	 * @return the primaryPhysicianID
	 */
	public String getPrimaryPhysicianID() {
		return primaryPhysicianID;
	}

	/**
	 * @param primaryPhysicianID
	 *            the primaryPhysicianID to set
	 */
	public void setPrimaryPhysicianID(String primaryPhysicianID) {
		this.primaryPhysicianID = primaryPhysicianID;
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

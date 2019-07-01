/**
 * 
 */
package com.ohiohealth.patient.controller.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author photonuser
 *
 */
@ApiModel(description = "The patient demographics information")
public class Demographics implements Serializable{

	private static final long serialVersionUID = -2186794453738719971L;

	@ApiModelProperty(notes="The patient ID", value="id")
	private String id;
	
	@ApiModelProperty(notes="The patient name", value="name")
	private String name;
	
	@ApiModelProperty(notes="The gender", value="gender")
	private String gender;
	
	@ApiModelProperty(notes="The petient type", value="type")
	private String type;
	
	@ApiModelProperty(notes="The location ID", value="locationID")
	private String locationID;
	
	@ApiModelProperty(notes="The location name", value="locationName")
	private String locationName;
	
	@ApiModelProperty(notes="The date of birth", value="dateOfBirth")
	private String dateOfBirth;
	
	@ApiModelProperty(notes="The contat email", value="contactEmail")
	private String contactEmail;
	
	@ApiModelProperty(notes="The phone number", value="contactPhoneNumber")
	private String contactPhoneNumber;
	
	@ApiModelProperty(notes="The address", value="address")
	private String address;
	
	@ApiModelProperty(notes="The city", value="city")
	private String city;
	
	@ApiModelProperty(notes="The state", value="state")
	private String state;
	
	@ApiModelProperty(notes="The zip code", value="zipCode")
	private String zipCode;
	
	@ApiModelProperty(notes="The marital status", value="maritalStatus")
	private String maritalStatus;
	
	@ApiModelProperty(notes="The primary physician ID", value="primaryPhysicianID")
	private String primaryPhysicianID;

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
	 */
	public Demographics(String id, String name, String gender, String type, String locationID, String locationName,
			String dateOfBirth, String contactEmail, String contactPhoneNumber, String address, String city,
			String state, String zipCode, String maritalStatus, String primaryPhysicianID) {
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
	}

	/**
	 * Default Constructor
	 */
	public Demographics() {
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
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
	 * @param name the name to set
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
	 * @param gender the gender to set
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
	 * @param type the type to set
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
	 * @param locationID the locationID to set
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
	 * @param locationName the locationName to set
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
	 * @param dateOfBirth the dateOfBirth to set
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
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
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
	 * @param maritalStatus the maritalStatus to set
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
	 * @param primaryPhysicianID the primaryPhysicianID to set
	 */
	public void setPrimaryPhysicianID(String primaryPhysicianID) {
		this.primaryPhysicianID = primaryPhysicianID;
	}

}

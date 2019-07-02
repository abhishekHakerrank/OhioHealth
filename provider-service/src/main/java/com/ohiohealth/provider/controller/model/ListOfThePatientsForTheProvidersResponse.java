package com.ohiohealth.provider.controller.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class ListOfThePatientsForTheProvidersResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4988847084056796766L;
	
	@ApiModelProperty(notes = "List of patiets for a provider", value="patients")

	private List<ListOfThePatientsForTheProvidersResponse_Patient> patients;


	/**
	 * @return the patients
	 */
	public List<ListOfThePatientsForTheProvidersResponse_Patient> getPatients() {
		return patients;
	}


	/**
	 * @param patients the patients to set
	 */
	public void setPatients(List<ListOfThePatientsForTheProvidersResponse_Patient> patients) {
		this.patients = patients;
	}


	/**
	 * 
	 */
	public ListOfThePatientsForTheProvidersResponse() {
		super();
	}


	public ListOfThePatientsForTheProvidersResponse(List<ListOfThePatientsForTheProvidersResponse_Patient> patients) {
		super();
		this.patients = patients;
	}

}

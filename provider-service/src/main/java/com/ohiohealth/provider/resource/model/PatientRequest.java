/**
 * 
 */
package com.ohiohealth.provider.resource.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The ListPatientReq - Request
 * 
 * @author photonuser
 *
 */
@ApiModel(description = "The patient resources")
public class PatientRequest implements Serializable {

	private static final long serialVersionUID = 7740440123600467568L;

	@NotNull
	@ApiModelProperty(notes="The provider id to get the patient list", value="providerID", example="120716")
	private String providerID;
	
	@ApiModelProperty(notes="The provider id type", value="providerIDType", example="CID")
	private String providerIDType;


	/**
	 * @param providerID
	 * @param providerIDType
	 */
	public PatientRequest(@NotNull String providerID, String providerIDType) {
		super();
		this.providerID = providerID;
		this.providerIDType = providerIDType;
	}
	/**
	 * 
	 * @return providerID
	 */

	public String getProviderID() {
		return providerID;
	}
	
	/**
	 * 
	 * @param providerID
	 */

	public void setProviderID(String providerID) {
		this.providerID = providerID;
	}

	/**
	 * 
	 * @return providerIDType
	 */
	public String getProviderIDType() {
		return providerIDType;
	}

	/**
	 * 
	 * @param providerIDType
	 */
	public void setProviderIDType(String providerIDType) {
		this.providerIDType = providerIDType;
	}

}

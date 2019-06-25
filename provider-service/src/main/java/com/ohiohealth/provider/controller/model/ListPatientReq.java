/**
 * 
 */
package com.ohiohealth.provider.controller.model;

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
@ApiModel(description = "The patient list request")
public class ListPatientReq implements Serializable {

	private static final long serialVersionUID = 7740440123600467568L;

	@NotNull
	@ApiModelProperty(notes="The user (EMP) id to get the patient list", value="userId", example="67576")
	private String userId;
	
	@ApiModelProperty(notes="The user id type for the EMP record", value="userIdType", example="External")
	private String userIdType;

	@ApiModelProperty(notes="The maximum number of patients that will be returned", value="maximumPatients", example="50")
	private int maximumPatients;
	
	@ApiModelProperty(notes="The next incremental load of patients on the list.", value="nextIncrementalLoad")
	private String nextIncrementalLoad;
	
	@ApiModelProperty(notes="The patient preferred gender idetity or the sex assigned at birth or the legal sex", value="sexType", example="1")
	private String sexType;
	
	@ApiModelProperty(notes="The category title or abbreviation or title", value="sexReturnType", example="1")
	private String sexReturnType;

	/**
	 * @param userId
	 * @param userIdType
	 * @param maximumPatients
	 * @param nextIncrementalLoad
	 * @param sexType
	 * @param sexReturnType
	 */
	public ListPatientReq(@NotNull String userId, String userIdType, int maximumPatients, String nextIncrementalLoad,
			String sexType, String sexReturnType) {
		super();
		this.userId = userId;
		this.userIdType = userIdType;
		this.maximumPatients = maximumPatients;
		this.nextIncrementalLoad = nextIncrementalLoad;
		this.sexType = sexType;
		this.sexReturnType = sexReturnType;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userIdType
	 */
	public String getUserIdType() {
		return userIdType;
	}

	/**
	 * @param userIdType the userIdType to set
	 */
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

	/**
	 * @return the maximumPatients
	 */
	public int getMaximumPatients() {
		return maximumPatients;
	}

	/**
	 * @param maximumPatients the maximumPatients to set
	 */
	public void setMaximumPatients(int maximumPatients) {
		this.maximumPatients = maximumPatients;
	}

	/**
	 * @return the nextIncrementalLoad
	 */
	public String getNextIncrementalLoad() {
		return nextIncrementalLoad;
	}

	/**
	 * @param nextIncrementalLoad the nextIncrementalLoad to set
	 */
	public void setNextIncrementalLoad(String nextIncrementalLoad) {
		this.nextIncrementalLoad = nextIncrementalLoad;
	}

	/**
	 * @return the sexType
	 */
	public String getSexType() {
		return sexType;
	}

	/**
	 * @param sexType the sexType to set
	 */
	public void setSexType(String sexType) {
		this.sexType = sexType;
	}

	/**
	 * @return the sexReturnType
	 */
	public String getSexReturnType() {
		return sexReturnType;
	}

	/**
	 * @param sexReturnType the sexReturnType to set
	 */
	public void setSexReturnType(String sexReturnType) {
		this.sexReturnType = sexReturnType;
	}
	
}

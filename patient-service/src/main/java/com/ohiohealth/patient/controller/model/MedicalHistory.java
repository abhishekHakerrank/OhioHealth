/**
 * 
 */
package com.ohiohealth.patient.controller.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author photonuser
 *
 */
public class MedicalHistory implements Serializable{

	private static final long serialVersionUID = -7825062935674973392L;

	@ApiModelProperty(notes = "Diagnosis code", value="code")
	private String Code;
	
	@ApiModelProperty(notes = "Diagnosis code type", value="codeType")
	private String codeType;
	
	@ApiModelProperty(notes = "Date of the Diagnosis", value="date")
	private String date;
	
	@ApiModelProperty(notes = "Comment on this Diagnosis", value="comment")
	private String comment;
	
	@ApiModelProperty(notes = "Entry source", value="source")
	private String source;
	
	@ApiModelProperty(notes = "Diagnosis name", value="diagnosisName")
	private String diagnosisName;
	
	@ApiModelProperty(notes = "Annotation or diagnosis name if the annotation is empty", value="displayName")
	private String displayName;
	
	@ApiModelProperty(notes = "SNOMED ID", value="snomedId")
	private String snomedId;

	@ApiModelProperty(notes = "SNOMED Description", value="snomedDesc")
	private String snomedDesc;

	/**
	 * @param code
	 * @param codeType
	 * @param date
	 * @param comment
	 * @param source
	 * @param diagnosisName
	 * @param displayName
	 * @param snomedId
	 * @param snomedDesc
	 */
	public MedicalHistory(String Code, String codeType, String date, String comment, String source, String diagnosisName,
			String displayName, String snomedId, String snomedDesc) {
		this.Code = Code;
		this.codeType = codeType;
		this.date = date;
		this.comment = comment;
		this.source = source;
		this.diagnosisName = diagnosisName;
		this.displayName = displayName;
		this.snomedId = snomedId;
		this.snomedDesc = snomedDesc;
	}

	/**
	 * Default Constructor
	 */
	public MedicalHistory() {
	}


	/**
	 * @return the code
	 */
	public String getCode() {
		return Code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		Code = code;
	}

	/**
	 * @return the codeType
	 */
	public String getCodeType() {
		return codeType;
	}

	/**
	 * @param codeType the codeType to set
	 */
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the diagnosisName
	 */
	public String getDiagnosisName() {
		return diagnosisName;
	}

	/**
	 * @param diagnosisName the diagnosisName to set
	 */
	public void setDiagnosisName(String diagnosisName) {
		this.diagnosisName = diagnosisName;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the snomedId
	 */
	public String getSnomedId() {
		return snomedId;
	}

	/**
	 * @param snomedId the snomedId to set
	 */
	public void setSnomedId(String snomedId) {
		this.snomedId = snomedId;
	}

	/**
	 * @return the snomedDesc
	 */
	public String getSnomedDesc() {
		return snomedDesc;
	}

	/**
	 * @param snomedDesc the snomedDesc to set
	 */
	public void setSnomedDesc(String snomedDesc) {
		this.snomedDesc = snomedDesc;
	}
	
}

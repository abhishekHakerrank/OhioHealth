/**
 * 
 */
package com.ohiohealth.patient.controller.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author photonuser
 *
 */
@ApiModel(description = "The patient medical history list response")
public class ListMedicalHistoryRes implements Serializable {

	private static final long serialVersionUID = 8838042778375679041L;

	@ApiModelProperty(notes = "Patient's medical history information", value="medicals")
	private List<MedicalHistory> MedicalHistory;
	
	@ApiModelProperty(notes = "Patient's pn medical history information", value="pnMedicals")
	private List<MedicalHistory> PNMedicalHistory;

	/**
	 * @return the medicalHistory
	 */
	public List<MedicalHistory> getMedicalHistory() {
		return MedicalHistory;
	}

	/**
	 * @param medicalHistory the medicalHistory to set
	 */
	public void setMedicalHistory(List<MedicalHistory> medicalHistory) {
		MedicalHistory = medicalHistory;
	}

	/**
	 * @return the pNMedicalHistory
	 */
	public List<MedicalHistory> getPNMedicalHistory() {
		return PNMedicalHistory;
	}

	/**
	 * @param pNMedicalHistory the pNMedicalHistory to set
	 */
	public void setPNMedicalHistory(List<MedicalHistory> pNMedicalHistory) {
		PNMedicalHistory = pNMedicalHistory;
	}

	/**
	 * @param medicalHistory
	 * @param pNMedicalHistory
	 */
	public ListMedicalHistoryRes(List<MedicalHistory> medicalHistory, List<MedicalHistory> pNMedicalHistory) {
		MedicalHistory = medicalHistory;
		PNMedicalHistory = pNMedicalHistory;
	}

	/**
	 * 
	 */
	public ListMedicalHistoryRes() {
	}

	
}

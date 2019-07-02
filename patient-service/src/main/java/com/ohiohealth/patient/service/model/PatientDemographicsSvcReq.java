/**
 * 
 */
package com.ohiohealth.patient.service.model;

import java.io.Serializable;

/**
 * @author photonuser
 *
 */
public class PatientDemographicsSvcReq implements Serializable {

	private static final long serialVersionUID = 5080313458496914770L;

	/**
	 * The patient Id
	 */
	private String patientId;

	/**
	 * The patient id type
	 */
	private String patientIdType;

	/**
	 * @param patientId
	 * @param patientIdType
	 */
	public PatientDemographicsSvcReq(String patientId, String patientIdType) {
		this.patientId = patientId;
		this.patientIdType = patientIdType;
	}

	/**
	 * Default Contructor
	 */
	public PatientDemographicsSvcReq() {
	}

	/**
	 * @return the patientId
	 */
	public String getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId
	 *            the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the patientIdType
	 */
	public String getPatientIdType() {
		return patientIdType;
	}

	/**
	 * @param patientIdType
	 *            the patientIdType to set
	 */
	public void setPatientIdType(String patientIdType) {
		this.patientIdType = patientIdType;
	}

}

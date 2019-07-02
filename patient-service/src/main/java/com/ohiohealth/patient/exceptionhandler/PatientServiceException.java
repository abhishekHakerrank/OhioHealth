/**
 * 
 */
package com.ohiohealth.patient.exceptionhandler;

/**
 * @author photonuser
 *
 */
public class PatientServiceException extends RuntimeException {

	private static final long serialVersionUID = -2259802572545926462L;

	/**
	 * @param message
	 * @param cause
	 */
	public PatientServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public PatientServiceException(String message) {
		super(message);
	}

}

/**
 * 
 */
package com.ohiohealth.patient.exceptionhandler;

/**
 * @author photonuser
 *
 */
public class PatientNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2259802572545926462L;

	/**
	 * @param message
	 * @param cause
	 */
	public PatientNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public PatientNotFoundException(String message) {
		super(message);
	}

}

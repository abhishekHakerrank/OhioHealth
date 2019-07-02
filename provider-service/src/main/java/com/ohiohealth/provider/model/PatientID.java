/**
 * 
 */
package com.ohiohealth.provider.model;

import java.io.Serializable;

/**
 * The Patient ID
 * 
 * @author photonuser
 */
public class PatientID implements Serializable {

	private static final long serialVersionUID = -3968774226059033172L;

	private String id;

	private String type;

	private String name;

	/**
	 * @param id
	 * @param type
	 * @param name
	 */
	public PatientID(String id, String type, String name) {
		this.id = id;
		this.type = type;
		this.name = name;
	}

	/**
	 * Default Constructor
	 */
	public PatientID() {
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
}

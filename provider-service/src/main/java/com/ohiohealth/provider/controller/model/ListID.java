package com.ohiohealth.provider.controller.model;

import java.io.Serializable;

public class ListID implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String type;

	private String name;


	
	public ListID(String id, String type, String name) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
	}



	public ListID() {
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	} 
	
	

}

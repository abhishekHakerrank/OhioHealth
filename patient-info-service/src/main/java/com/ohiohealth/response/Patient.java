package com.ohiohealth.response;


public class Patient {
	
	private Integer Id;
	private String name;
	private String sex;
	private String address;
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Patient [Id=" + Id + ", name=" + name + ", sex=" + sex + ", address=" + address + "]";
	}
	
	

}

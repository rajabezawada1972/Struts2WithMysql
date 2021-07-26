package com.raja.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.raja.utils.DbUtils;

public class RegisterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name, email, city;

	public String execute() throws Exception {

		int var = DbUtils.insert(this);
		if (var > 0) {
			return "SUCCESS";
		} else {
			return "input";
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
                        

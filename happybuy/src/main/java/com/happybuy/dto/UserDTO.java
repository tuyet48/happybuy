package com.happybuy.dto;

import com.happybuy.model.User;

public class UserDTO {
	
	private String password;
		
	private String email;
	
	private String fname;
	
	private String lname;
	
	public User copyTo() {
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);	
		user.setFirstName(fname);
		user.setLastName(lname);
		return user;		
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}

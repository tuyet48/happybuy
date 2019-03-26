package com.happybuy.dto;

import com.happybuy.model.User;

public class UserDTO {
	
	private String password;
	
	private String email;
	
	public User copyTo() {
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);	
		return user;		
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

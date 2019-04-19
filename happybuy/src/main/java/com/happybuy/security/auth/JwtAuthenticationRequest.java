package com.happybuy.security.auth;

/**
 * Created by fanjin on 2017-10-09.
 */
public class JwtAuthenticationRequest {
    private String username;
    private String password;
   // private String email;
   
	public JwtAuthenticationRequest() {
        super();
    }

    public JwtAuthenticationRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
       // this.setEmail(email);
    }   

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 

}

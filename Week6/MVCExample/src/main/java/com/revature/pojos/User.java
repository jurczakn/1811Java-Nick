package com.revature.pojos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	
	@NotNull(message="Please enter a username")
	@Size(min=6, max=15, message="Username must be between 6 and 15 characters")
	private String username;
	
	@NotNull(message="please enter a password")
	@Size(min=8, max=20, message="Password must be between 8 and 20 characters")
	@Pattern(regexp=".[a-z].[0-9].", message="Must have at least one number and one letter")
	private String password;
	
	private String fullName;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", fullName=" + fullName + "]";
	}

	public User(String username, String password, String fullName) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}

	public User() {
		super();
	}
	
}

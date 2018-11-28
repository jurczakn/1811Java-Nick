package com.revature.domain;

public class User {

	String username;
	
	String password;
	
	String fname;
	
	String lname;
	
	Integer numberOfLegs;

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

	public Integer getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(Integer numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public User(String username, String password, String fname, String lname, Integer numberOfLegs) {
		super();
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.numberOfLegs = numberOfLegs;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", fname=" + fname + ", lname=" + lname
				+ ", numberOfLegs=" + numberOfLegs + "]";
	}
	
	
	
}

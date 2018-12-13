package com.revature.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog implements ThreeLegged{

	@Value("3")
	private Integer numberOfLegs;
	
	@Value("David")
	private String name;
	
	@Value("true")
	private Boolean salivating;

	public Integer getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(Integer numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getSalivating() {
		return salivating;
	}

	public void setSalivating(Boolean salivating) {
		this.salivating = salivating;
	}

	public Dog(Integer numberOfLegs, String name, Boolean salivating) {
		super();
		this.numberOfLegs = numberOfLegs;
		this.name = name;
		this.salivating = salivating;
	}

	public Dog() {
		super();
	}

	@Override
	public String toString() {
		return "Dog [numberOfLegs=" + numberOfLegs + ", name=" + name + ", salivating=" + salivating + "]";
	}
	
}

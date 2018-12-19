package com.revature.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {
	
	@Autowired
	List<ThreeLegged> threeLegged;
	
	//@Autowired
	//@Inject
	//@Resource
	private Dog dog;
	
	@Value("10")
	private Integer numberOfLegs;
	
	@Value("Hugo")
	private String name;

	public Dog getDog() {
		return dog;
	}

	//@Autowired
	public void setDog(Dog dog) {
		this.dog = dog;
	}

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

	public List<ThreeLegged> getThreeLegged() {
		return threeLegged;
	}

	public void setThreeLegged(List<ThreeLegged> threeLegged) {
		this.threeLegged = threeLegged;
	}

	public Cat(Dog dog, Integer numberOfLegs, String name) {
		super();
		this.dog = dog;
		this.numberOfLegs = numberOfLegs;
		this.name = name;
	}

	@Autowired
	public Cat(Dog dog){
		super();
		this.dog = dog;
	}
	
	public Cat() {
		super();
	}

	@Override
	public String toString() {
		return "Cat [threeLegged=" + threeLegged + ", dog=" + dog + ", numberOfLegs=" + numberOfLegs + ", name=" + name
				+ "]";
	}
	
}

package com.example.reflection;

public class Glass {
	
	//creating a private field
	private String s;
	
	//creating a public constructor
	public Glass() {
		s="Timothy";
	}
	
	//creating a public method with no arguments
	public void method1() {
		System.out.println("The string is " + s);
	}
	
	//creating a public method with int as an argument
	public void method2(int a) {
		System.out.println("The number is " + a);
	}
	
	//creating a private method
	private void method3() {
		System.out.println("Private method invoked");
	}

}

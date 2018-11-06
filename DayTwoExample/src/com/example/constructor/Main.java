package com.example.constructor;

public class Main {
	
	// this and super keywords
	// this - references the no args constructor of the same class
	// super - references the constructor of the parent class
	
	// instance variable
	int a = 10;
	
	// static variable
	static int b = 20;

	public void TestMethod() {
		this.a=100;
		System.out.println(a);
		
		this.b=600;
		
		
	}
	public static void main(String[] args) {

//		this.a=700;
//		this.b=500;
	}

}
package com.example.strings;

public class Main {

	// difference between stack and heap
	// both are data structures, both parts of Java Memory Model (JMM)
	// heap -> where all objects are stored
	// stack -> methods, parameters, return types, local variables
	
	public static void main(String[] args) {

	//String stringOne = new String("Lewis"); 	//"Lewis" in the heap because
												//the string was created using the new keyword
	String stringOne = ("Lewis");				//"Lewis" in the string pool
	
	if(stringOne=="Lewis") {
//		System.out.println("inside if statement");
	}
	//since Lewis was created using "new" keyword, this is false
	//if Lewis is a string literal, the if statement is true
	
	if(stringOne.equals("Lewis")) {	// .equals checks actual value
//		System.out.println("dot equals if statement");
	}
	//checks the actual characters
	
	//strings are immutable
	String stringTwo = "Jacob";
	stringTwo.concat(" and Bob");  // this will print only Jacob
	
	stringTwo=stringTwo.concat(" and Bob"); //this prints Jacob and Bob
//	System.out.println(stringTwo);

	
	
	StringBuilder sBuilderOne = new StringBuilder("kittenh");
	sBuilderOne.append(" look at me!!!! :3");
	
	// StringBuilder overrides the toString method
	// sBuilderOne can be changed, strings cannot
//	System.out.println(sBuilderOne);
	
	
	StringBuffer sBufferOne = new StringBuffer("BirdPerson");
	sBufferOne.append(" and a doggo");
	System.out.println(sBufferOne);
	
	//thread safe
	//slower
	
	


	
	
	}

}

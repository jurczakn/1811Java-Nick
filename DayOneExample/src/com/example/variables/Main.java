package com.example.variables;

public class Main {

	// what are variables?
	// a value is stored and identified in memory by a variable
	// variables have a name that makes it possible to access the value
	// variables have a type that defines what sort of value it stores

	// primitive data types - variables that store simple values.
	// 8 in Java:

	// integer types:
	// Byte - 8 bits
	// Short - 16 bits
	// Int - 32 bits
	// Long - 64 bits

	// floating-point types
	// Float - 32 bits
	// Double - 64 bits

	// Logical type:
	// Boolean - no memory allocation (1 bit)

	// Character type:
	// Char - 16 bits

	public static void main(String[] args) {
		int variable; // the simplest variable declaration
		int variableTwo = 27; // we can give variables their values at declaration
		
		int i = 2; //integer value
		double d = 2.3; // decimal value
		float f = 993.99f; // floating point value, low accuracy
							// if there is no "f" - remains a doubke
		long l = 8765432345l; 
		char c = 'n'; //a character value
		byte b = 7;
		boolean bool = false; //true or false value
		short s= 12;
		
		//what happens if I put an underscore in the number?
		int i2 = 369_893;
		System.out.println(i2); 
		// it makes it easier to read
		
		// naming a variable
		// case sensitivity
		// can only use number, letters, and $ or _ characters
		// cannot begin with a number
		// cannot be a reserved Java keyword
		
	}

}

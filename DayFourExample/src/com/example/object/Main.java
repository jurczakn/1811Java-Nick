package com.example.object;

public class Main {

	public static void main(String[] args) {

		//every class you create inherits from java.lang.Object
		
		Object obj = new Object();
		
		//know about toString, equals, and hashcode
		
		//toString returns a string, simple as that
		//the print methods call an Object's toString() by default
		//hashcode - integer representation of the memory location
		
	
		
		ToStringExample a = new ToStringExample();
		//System.out.println(a);
		
		//hashcode
		//returns an integer representation of the memory address
		
//		int hashcode = obj.hashCode();
//		System.out.println(String.valueOf(hashcode));
		
		//System.out.println(obj.hashCode());
		
		//.equals
		//checking whether the contents of two objects are equal
		System.out.println(obj.equals(a));
	}

}

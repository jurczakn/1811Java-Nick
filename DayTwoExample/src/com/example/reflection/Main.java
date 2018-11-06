package com.example.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

	//Reflection API
	// library that allows us to inspect and/or modify runtime
	// attributes of classes, interfaces, fields, and methods
	// used mostly for debugging purposes/information purposes
	
	public static void main(String[] args) throws Exception {
		
		//creating object whose property is to be checked
		Glass obj = new Glass();
		
		//creating class object from the object using getClass method
		Class cls = obj.getClass();
		System.out.println("The name of the class is " + cls.getName());

		
		//getting the constructor of the class through the object
		//of the class
		Constructor con = cls.getConstructor();
		System.out.println("The name of the constructor is " +con.getName());
		
		System.out.println("The public methods of the class are: ");
		
		//getting the methods of the class through the object
		//of the class by using getMethods
		Method[] methods = cls.getMethods();
		
		//printing method names
		for(Method method : methods)
			System.out.println(method.getName());
			
		
	}

}

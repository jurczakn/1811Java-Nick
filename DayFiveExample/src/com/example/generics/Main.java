package com.example.generics;

//Generics
//generic methods and generic classes enable programmers
//to specify, with a single method declaration, a set of related methods, or
//with a single class declaration, a set of related types, respectively.

//Generics enforce compile time safety by allowing you to use 
//parameterized types.
//syntax: <>

//to use generics with methods:
// public static <T> void method1() {}

//you can also restrict Generics to use a subset of all object:
// public static <T implements Runnable> void method2() {}

class GenericClass<T> {
	private T value;

	public GenericClass(T value) { // constructor
		this.value = value;
	}

	public T getValue() { // getter
		return value;

	}
}

//Naming conventions:
//Type Parameters can be named anything you want, but the convention is to use
//single, uppercase letters to make it obvious that they are not real class
//names

// T => Generic data type
// E => Element
// K => Map Key
// V => Map Value
// N => Number

public class Main {

	public static void main(String[] args) {

	//GenericClass<String> genericClass = new GenericClass<String>("GenCla");
	//GenericClass<Integer> genericClass = new GenericClass<>(5);
	//do not need to pyt anything into the right diamonds
	
	//GenericClass<Object> genericClass = new GenericClass<>("String");
	//strings are objects 
	
	//bad practice to do so, because you want to restrict the data type
	//so that you don't get unexpected object types
	//using diamond brackets gives you compile time safety
	
	GenericClass genericClass = new GenericClass<>("String");
	//defaults to object
	
	System.out.println(genericClass.getValue());
	}

}

package com.example.keywords;

public class Animal {

	public String name; // variables should be private
	public int speed; // getters/setters are public
	private int numberOfLegs;

	// what is a constructor?
	// they return an instance of a class.
	// do not have a return type
	// if no constructor is explicitly provided, the JVM provides a no-argument
	// constructor by default
	// first line in any constructor is either this() or super()

	public Animal() {
	}

	// getters -> accessors
	// setters -> mutators
	// process of encapsulation

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	// access modifiers
	// - restricts access to variables/methods/certain members/etc
	// "private" - class itself
	// default - class itself, package
	// "protected" - class itself, package, children
	// "public" - class itself, package, children, everything

	// Scopes of a variable: (where the variable exists)
	// a variable's reference will only exist within the context of its
	// declared scope, which is based on the location of its declaration

	// class/static - exists within the class itself
	// instance/object - only exist within the specific object
	// method/local - only exist within the specific method
	// block - only exist within the specific block (if, for, while)

	// instantiation is when memory is allocated for an object.
	// "new" keyword.
	// initialization is when values are put into the memory that was allocated.
	// declaration is when you state to the program that there will be
	// an object of a certain type existing and what the name of that
	// object will be.

	// Animal a = null; // only initialized, not instantiating

	// casting?
	// taking an object of one particular type and turning it
	// into another object type

	// upcasting - cast a subtype to a supertype,
					//upward the inheritance tree
	// downcasting - casting to a subtype, 
					//downward the inheritance tree 

}

package com.example.inheritance;

// polymorphism
// implementation of polymorphism is overriding and overloading

// overloading?
// there are two or more methods in a class with the same method
// name, but different parameters. 
// compile time polymorphism

// overriding?
// when a method in a child class has the same name as a method
// in its parent class, however with different implementation
// runtime polymorphism

public class SuperVillain extends SuperHero {
	// use inheritance, if we inherit from a class -> "extends"
	// if we inherit from an interface -> "implements"
	
	String alias="Bacon Pancake";
	
	public SuperVillain() {
		super("give it a string");
//		System.out.println("In SuperVillain constructor()");
//		System.out.println("In SuperVillain, alias is " + alias);
	}
	
	@Override
	public void alterweakness() {
		weakness = "frying pan";
	}
	
	@Override
	public String getName() {
		return new String();
	}

}

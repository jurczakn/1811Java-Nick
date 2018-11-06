package com.example.keywords;

public class Main {

	// public - the method can be invoked from anywhere
	// static - implies that the variable or method belong to the class,
	// not individual instances.
	// static - the method can be invoked without creating an instance of the class.
	// void - method doesn't return any value
	// args - method can take command line arguments as an array of Strings
	// does not work without args :(

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.setSpeed(20);
		animal.setName("Bob Cheetah");
		animal.setNumberOfLegs(10);
		
		System.out.println("The animal's name is " + animal.getName());
		System.out.println(animal.getNumberOfLegs());
	}

}

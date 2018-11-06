package com.example.wrapper;

public class Main {

	public static void main(String[] args) {

		// primitive datatype
		// int, short, long, boolean, double, float, byte, char

		// wrapper is a class that encapsulates a primitive data types

		Integer i = new Integer(3);

		short s = 3;
		Short s2 = new Short(s);

		Boolean b = new Boolean(true);
		// all primitive data types have wrapper versions, the wrappers are TitleCase
		// because they are classes

		// boxing (autoboxing) -> primitive to Wrapper
		// unboxing -> Wrapper to primitive

		Integer num = 700;
		Float f = 998f; // (auto)boxing

		float tempFloat = f; //unboxing

	}

}

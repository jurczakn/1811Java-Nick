package com.example.enhancedloop;

import java.util.ArrayList;

public class Main {

	//what is an arraylist?
	//similar to an array but the size is not fixed
	//dynamic array
	//ArrayList can not contain primitive data types, it can 
	//only contain Object
	
	public static void main(String[] args) {

	ArrayList<String> names = new ArrayList<String>();
	
	names.add("Jacob");
	names.add("Zaryn");
	names.add("David");
	names.add("Anthony");
	names.add("Caleb");
	names.add("Jaron");
	
	for(String nm : names)			// "in"
		System.out.println(nm);	
	}

}

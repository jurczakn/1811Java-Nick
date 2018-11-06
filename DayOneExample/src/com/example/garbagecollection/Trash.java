package com.example.garbagecollection;

public class Trash {

	// objects are stored in the heap
	// everything else is stored in the stack
	
	//Garbage collection - one of Java's features
	// process of automatically freeing memory on the heap by 
	// deleting objects that are no longer reachable in your 
	// program
	
	public static void main(String[] args) {
		String s = "Timothy";
		Object o = new Object();
		Object o2;
		Object o3 = new Object();
		//checkpoint 1: no garbage collection at this point
		o2=o;
		o = null;
		//checkpoint 2: no garbage collection
		s=null;
		//checkpoint 3: garbage collection -> tomorrow
		o3 = new Object();
		//checkpoint 4: garbage collection -> old instance is gone
		
		System.gc(); //call the garbage collector
		
		//finalize -> method that allows you to close any connections 
		// or any "clean up" before the garbage collection comes by
		
	}

}

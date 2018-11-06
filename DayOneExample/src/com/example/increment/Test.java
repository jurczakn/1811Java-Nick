package com.example.increment;

public class Test {

	public static void main(String[] args) {
		
		char c = 'a'; // single quotes are for characters,
						// double quotes are for strings.
		
		
//	i=c;	// every character has an assumed integer value.
			// ascii value, java is implicitly casting it, no data loss

//	System.out.println(i);
		
//	c=i; //mismatch type, cannot convert from int to char
		
//	System.out.print(); //ln makes a new line, remove it to 
						//print things next to each other
	int i = 300;
	System.out.println(i+i+"Blue");	// 600Blue
	System.out.println(i+"Blue");	// 300Blue
	System.out.println("Red"+i+i);	// Red300300
	
	//order of operations!!! left to right! 
	
	
	}

}

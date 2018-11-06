package com.example.inheritance;

public class Main {
	
	// you can't override a static method
	
	private static SuperHero superVillain;

	public static void main(String[] args) {
		
		SuperHero superHero = new SuperHero();
		SuperVillain sV = new SuperVillain();
		
		SuperHero sH = new SuperVillain();	// upcasting
		
		SuperHero superH = new SuperVillain();
		
//		System.out.println(superH.alias); //C-Dawg
//		System.out.println(((SuperVillain)superH).alias); //Bacon Pancake
		// casting - taking an object of one particular type
		// and turning it into another object type
		
		superH.alterweakness();
//		System.out.println(superH.weakness); //frying pan
		
		System.out.println(((SuperVillain)superH).weakness); //frying pan

		
		//final in method -> cannot be overridden 
	}

}

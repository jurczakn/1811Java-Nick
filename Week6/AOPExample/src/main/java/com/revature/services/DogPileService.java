package com.revature.services;

import org.springframework.stereotype.Service;

@Service
public class DogPileService {
	
	public void dogPile(int number){
		System.out.println("This is now a dog pile with " + number + " dogs");
	}

	public void dogRest(){
		System.out.println("The dogs are now resting from the dog pile");
	}
	
	public void prepare(){
		System.out.println("We are now preparing for a dog pile");
		throw new RuntimeException();
	}
	
}

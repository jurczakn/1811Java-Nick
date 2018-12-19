package com.revature.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PileAdvice {
	
	@Before("execution(void com.revature.services.DogPileService.dogPile(int))")
	public void beforeDogPile(){
		System.out.println("The dog pile is about to happen.");
	}
	
	@After("execution(void com.revature.services.DogPileService.dog*(..))")
	public void afterDogMethod(){
		System.out.println("The dogs just did a thing");
	}
	
	@AfterReturning("dogPileServiceMethods()")
	public void dogPileReturning(){
		System.out.println("This dog pile method returned properly");
	}
	
	@AfterThrowing("dogPileServiceMethods()")
	public void dogPileThrowing(){
		System.out.println("This dog pile method through and exception");
	}
	
	@Pointcut("execution(* com.revature.services.DogPileService.*(..))")
	public void dogPileServiceMethods(){
		//This is a hook
		//It's an empty method so that we can reuse and annotation
	}
}

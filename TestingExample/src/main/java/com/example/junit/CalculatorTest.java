package com.example.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

/*
	 * what is JUnit?
	 * Testing framework.
	 * Specifically, it is a unit testing framework.
	 * 
	 * what is unit testing?
	 * unit testing is testing a small portion of your program,
	 * typically, a method. Method is a unit.
	 * (as opposed to integration testing - testing a lot of stuff
	 * at once)
	 * 
	 * JUnit is important for TDD (Test Driven Development)
	 * TDD is writing tests before you write code.
	 * Benefits of TDD:
	 * 		you create a detailed specification of what you want your method to do
	 * 		requires you to think about what you want from each piece of code.
	 * 		modularity - the goal of programming, modules work by themselves/independent/reusable
	 * 
	 * 
	 * JUnit provides us with static methods in the org.junit.Assert class to test
	 * for certain conditions. These methods usually start with "assert"
	 * and let you specify an error message, the expected result, and the actual
	 * result. If the test fails, the "assert" method will throw an AssertionException.
	 */
	
	public class CalculatorTest{
		
		Calculator tester = new Calculator();
		
	@Test // lets JUnit and us know that we are writing a test
	public void same() {
		assertEquals("should return true", true, tester.same(10, 10));
	}
	
	/*
	 * @Ignore -> ignores the method test that has this annotation 
	 * @After -> have a method that will run after each test
	 * @Before -> have a method that will run before each test
	 * @AfterClass -> have a method that will run after the class
	 * @BeforeClass -> have a method that will run before the class
	 */
	
	@After
	public void afterMethod() {
		System.out.println("\n************After each method*************");
	}
}

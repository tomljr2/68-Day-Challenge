package co.tomlinson;

/*
        Day 9: JUnit Assertions

        This is a simple program that tests all of the assert
        methods that JUnit offers.
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class AssertTester {
	
	public static void main(String[] args)
	{
		// Run the tests to make sure they all passed
		Result result = JUnitCore.runClasses(AssertTest.class);
		if(result.wasSuccessful())
			System.out.println("All test cases passed! JUnit works!");
		else
			System.out.println("Not all test cases passed! This is your fault, not JUnit's.");
		
	}
	
	public Integer throwException()
	{
		throw new NullPointerException();
	}

}

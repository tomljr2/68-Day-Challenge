package co.tomlinson;

/*
   Day 10: Reflex Testing

   This is a program that will see how good a
   user's reflexes are.
*/

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Random;
import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Reflexer {

	public static void main(String[] args)
	{
		Result result = JUnitCore.runClasses(JUnitClass.class);
		Integer failures = result.getFailureCount();
		System.out.println("\nSuccesses: "+(10-failures)+"\nFailures: "+failures);
	}
	
	public Character displayChar()
	{
		Random rand = new Random();
		return (char) (rand.nextInt(26)+65);
	}
	
	public Character getChar()
	{
		Reader reader = new InputStreamReader(System.in);
		try {
			return (char) reader.read();
		} catch (IOException e) {
		}
		return 0;
	}
	
	// Loop until the user presses space
	public void beginTesting()
	{
		Reader reader = new InputStreamReader(System.in);
		Character c = '1';
		while(c!='\n')
		{
			try {
				c = (char) reader.read();
			} catch (IOException e) {}
		}
	}
}

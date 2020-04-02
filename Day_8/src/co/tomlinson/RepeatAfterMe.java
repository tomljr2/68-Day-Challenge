package co.tomlinson;

/*
 	Day 8: Repeat After Me
 	
 	This is a simple program that uses JUnit to test if the user is
 	correctly repeating a random string that the program asks them
 	to repeat.
 */

import java.util.Random;
import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RepeatAfterMe {
	public static void main(String[] args)
	{
		// Perform the JUnit test to see if the two strings are equal
		Result result = JUnitCore.runClasses(JUnitClass.class);
		if(result.wasSuccessful())
			System.out.println("Congrats! You can listen to instructions.");
		else
			System.out.println("Congrats! You failed an extremely simple task. :)");

	}
	
	public String randomString()
	{
		Random rand = new Random();
		String orig = new String();
		
		// Create a random string and output the result to repeat
		for(int i = 0; i < 10; i++)
			orig+=((char)(rand.nextInt(94)+33));
		
		System.out.println("Repeat after me: " + orig);
		
		return orig;
	}
	
	public String repeat()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("I said: ");
		String res = scanner.nextLine();
		scanner.close();
		return res;
	}
}

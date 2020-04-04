package co.tomlinson;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class JUnitClass {

	Reflexer reflexer;
	long averageTime;
	int i;
	
	@Before
	public void setup()
	{
		// Initialize variables
		reflexer = new Reflexer();
		averageTime=0;
	}
	
	@Test
	public void Test()
	{
		long startTime;
		System.out.println("This program will be used to test your reflexes. "+
	                       "A letter will appear and you will press that letter as "+
				           "quickly as you can. After 10 trials, you will see the "+
	                       "number of successes, failures, and the average success "
	                       + "response time.\n"+
				           "Press enter to start: ");
		reflexer.beginTesting();
		
		// Loop through 10 tests of the user inputting their response
		for(i = 1; i < 11; i++)
		{
			Character disp = reflexer.displayChar();
			System.out.println(disp);
			startTime = System.currentTimeMillis();
			Character user = Character.toUpperCase(reflexer.getChar());
			averageTime += (System.currentTimeMillis() - startTime);
			System.out.println();
			assertEquals(disp,user);
		}
	}
	
	@After
	public void ending()
	{
		if(i != 11)
		{
			System.out.println("Whoops! You failed too early.");
		}
		System.out.print("\nAverage Success Time: " + (averageTime/i) + "ms");
	}
}

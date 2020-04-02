package co.tomlinson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitClass {

	@Test
	public void setup()
	{
		RepeatAfterMe ram = new RepeatAfterMe();
		String orig =  ram.randomString();
		String res = ram.repeat();
		assertEquals(orig,res);
	}
}

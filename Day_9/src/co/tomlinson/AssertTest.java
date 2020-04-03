package co.tomlinson;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void assertTest()
	{
		// Tests if two integer arrays are equal
		Integer[] iArr1 = {1,2,3,4,5};
		Integer[] iArr2 = {1,2,3,4,5};
		assertArrayEquals(iArr1,iArr2);
		
		// Tests if two strings are equal
		String str1 = new String("Hello World!");
		String str2 = "Hello World!";
		assertEquals(str1,str2);
		
		// Tests if a condition is false
		Integer a = 3;
		Integer b = 4;
		Integer c = 5;
		assertFalse(((a*a)+(b*b)) != (c*c));	// Pythagorean theorem
		
		// Test if two objects are not equal
		String str3 = "Hello world!";
		assertNotEquals(str1,str3);
		
		//Tests if an object is not null
		assertNotNull(iArr1);
		
		// Tests if two objects do not refer to the same object
		assertNotSame(iArr1,iArr2);
		
		// Tests if an object is null
		Integer d = null;
		assertNull(d);
		
		// Tests if two objects refer to the same object
		Integer[] iArr3 = iArr1;
		assertSame(iArr1,iArr3);
		
		// Tests if a method throws an exception
		AssertTester aT = new AssertTester();
		assertThrows(NullPointerException.class, () -> aT.throwException());
		
		// Tests if a condition is true
		assertTrue(((a*a)+(b*b)) == (c*c));
	}
}

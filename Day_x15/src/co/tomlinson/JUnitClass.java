package co.tomlinson;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;

import co.tomlinson.circle.Circle;

public class JUnitClass {

	ArrayList<Float> radii; 
	ArrayList<Float> diameters; 
	ArrayList<Float> areas; 
	ArrayList<Float> circumferences; 
	ArrayList<Circle> circles;
	
	@Before
	public void setup()
	{
		// Initialize variables
		radii = new ArrayList<>(Arrays.asList(0f,1.0f,1.5f,2.0f,3.1415926535f,4.0f,5.0f,10.0f));
		diameters = new ArrayList<>(Arrays.asList(0f,2.0f,3.0f,4.0f,6.283185307f,8.0f,10.0f,20.0f));
		areas = new ArrayList<>(Arrays.asList(0f,3.1415926535f,7.068583470375f,12.566370614f,31.006279f,50.265482456f,78.5398163375f,314.15926535f));
		circumferences = new ArrayList<>(Arrays.asList(0f,6.283185307f,9.4247779605f,12.566370614f,19.73921f,25.132741228f,31.415928f,62.831856f));
		circles = new ArrayList<>();
		for(Float radius : radii){ circles.add(new Circle(radius)); }
	}
	
	@Test
	public void RadiusTest()
	{
		// Make sure the circle class is returning the correct radius
		for(int i = 0; i < radii.size(); i++)
		{
			assertEquals(radii.get(i),circles.get(i).getRadius());
		}
	}
	
	@Test
	public void DiameterTest()
	{
		// Make sure the circle class is returning the correct radius
		for(int i = 0; i < diameters.size(); i++)
		{
			assertEquals(diameters.get(i),circles.get(i).getDiameter());
		}
	}
	
	@Test
	public void AreaTest()
	{
		// Make sure the circle class is returning the correct radius
		for(int i = 0; i < areas.size(); i++)
		{
			assertEquals(areas.get(i),circles.get(i).getArea());
		}
	}
	
	@Test
	public void CircumferenceTest()
	{
		// Make sure the circle class is returning the correct radius
		for(int i = 0; i < circumferences.size(); i++)
		{
			assertEquals(circumferences.get(i),circles.get(i).getCircumference());
		}
	}
}

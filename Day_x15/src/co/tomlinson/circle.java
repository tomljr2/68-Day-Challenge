package co.tomlinson;
/*
   Day 15: Circle class testing

   I've been very busy lately but I still want to
   have a program to put on github, so this just tests
   the circle class in junit. This is a bit more of a
   classical use of junit compared to how I've been
   using it.
*/

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

class circle{
   public static class Circle
   {
      // Default constructor
      public Circle(){ radius=1.0f; }

      // Constructor with one argument
      public Circle(Float radius){ this.radius = radius; }

      // Functions that are useful in a circle
      public Float getRadius(){ return radius; }
      public Float getDiameter(){ return radius*2.0f; }
      public Float getArea(){ return PI * radius * radius; }
      public Float getCircumference(){ return 2.0f * PI * radius; }

      private Float radius;
      private final Float PI = 3.1415926535f;
   }
   
   public static void main(String[] args)
	{
		Result result = JUnitCore.runClasses(JUnitClass.class);
		if(result.wasSuccessful())
			System.out.println("All tests passed successfully.");
		else
			System.out.println("A test failed.");

	}
};

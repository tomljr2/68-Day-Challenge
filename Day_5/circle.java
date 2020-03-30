/*
   Day 5: Circle class

   This is a simple class that defines common
   useful elements and functions for a circle.
*/

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
      // No stdin today for simplicity
      final Float RADIUS = 2.5f;

      Circle unitCircle = new Circle();
      Circle userCircle = new Circle(RADIUS);

      // Print unit circle
      System.out.println("Unit Circle\n"
                       + "___________\n"
                       + "Radius: " + unitCircle.getRadius()
                       + "\nDiameter: " + unitCircle.getDiameter()
                       + "\nArea: " + unitCircle.getArea()
                       + "\nCircumference: " + unitCircle.getCircumference()
                       + "\n");

      // Print user circle
      System.out.println("User Circle\n"
                       + "___________\n"
                       + "Radius: " + userCircle.getRadius()
                       + "\nDiameter: " + userCircle.getDiameter()
                       + "\nArea: " + userCircle.getArea()
                       + "\nCircumference: " + userCircle.getCircumference());
   }
}


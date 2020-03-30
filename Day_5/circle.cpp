/*
   Day 5: Circle class

   This is a simple class that defines common
   useful elements and functions for a circle.
*/

#define PI 3.1415926535
#include <iostream>
using namespace std;

class Circle
{
   public:
      // Default constructor
      Circle(){ radius=1.0; }

      // Constructor with one argument
      Circle(float radius){ this->radius=radius; }

      // Functions that are useful in a circle
      float getRadius(){ return radius; }
      float getDiameter(){ return radius*2.0; }
      float getArea(){ return pi * radius * radius; }
      float getCircumference(){ return 2 * pi * radius; }

   private:
      float radius;
      const float pi = PI;
};

int main()
{
   // No stdin today for simplicity
   const float RADIUS = 2.5;

   Circle unitCircle;
   Circle userCircle(RADIUS);

   // Print unit circle
   cout << "Unit Circle\n"
        << "___________\n"
        << "Radius: " << unitCircle.getRadius()
        << "\nDiameter: " << unitCircle.getDiameter()
        << "\nArea: " << unitCircle.getArea()
        << "\nCircumference: " << unitCircle.getCircumference()
        << endl << endl;

   // Print user circle
   cout << "User Circle\n"
        << "___________\n"
        << "Radius: " << userCircle.getRadius()
        << "\nDiameter: " << userCircle.getDiameter()
        << "\nArea: " << userCircle.getArea()
        << "\nCircumference: " << userCircle.getCircumference()
        << endl;
   return 0;
}

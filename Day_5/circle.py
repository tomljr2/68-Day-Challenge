"""
   Day 5: Circle class

   This is a simple class that defines common
   useful elements and functions for a circle.
"""
class Circle:
   # Constructors work differently in Python
   def __init__(self,radius=1.0):
      self.__radius = radius

   __pi = 3.1415926535

   # Functions that are useful in a circle
   def getRadius(self): return self.__radius
   def getDiameter(self): return self.__radius*2.0
   def getArea(self): return self.__pi * self.__radius * self.__radius
   def getCircumference(self): return 2.0 * self.__pi * self.__radius

# No stdin today for simplicity
RADIUS = 2.5

unitCircle = Circle()
userCircle = Circle(RADIUS)

print("Unit Circle\n" +\
      "___________\n" +\
      "Radius: " + str(unitCircle.getRadius()) +\
      "\nDiameter: " + str(unitCircle.getDiameter()) +\
      "\nArea: " + str(unitCircle.getArea()) +\
      "\nCircumference: " + str(unitCircle.getCircumference()) +\
      "\n")

print("User Circle\n" +\
      "___________\n" +\
      "Radius: " + str(userCircle.getRadius()) +\
      "\nDiameter: " + str(userCircle.getDiameter()) +\
      "\nArea: " + str(userCircle.getArea()) +\
      "\nCircumference: " + str(userCircle.getCircumference()))

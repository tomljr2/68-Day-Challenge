"""
   Day 2: BMI Calculator

   This is a program to calculate a user's BMI from either
   imperial or metric units.
"""

choice = input("Choose your units\n\t1.Metric\n\t2.Imperial\nChoice: ")

# Calculate the BMI with metric units
if choice == str(1):
   height = float(input("\nEnter your height (m): "))
   weight = float(input("\nEnter your weight (kg): "))
   print("BMI: " + str(weight / (height * height)))
# Calculate BMI with imperial units
else:
   height = float(input("\nEnter your height (in): "))
   weight = float(input("\nEnter your weight (lbs): "))
   print("BMI: " + str(703.0 * weight / (height * height)))

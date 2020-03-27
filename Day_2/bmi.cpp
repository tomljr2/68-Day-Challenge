/*
   Day 2: BMI Calculator

   This is a program to calculate a user's BMI from either
   imperial or metric units.
*/
#include <iostream>
using namespace std;

int main()
{
   int choice;
   float weight;
   float height;

   // Note: No error checking yet (Loops tomorrow)
   cout << "Choose your units\n\t1.Metric\n\t2.Imperial\nChoice: ";
   cin >> choice;
   cout << endl;

   // Calculate the BMI with metric units
   if(choice == 1)
   {
      cout << "Enter your height (m): ";
      cin >> height;
      cout << "\nEnter your weight (kg): ";
      cin >> weight;
      cout << "\nBMI: " << weight / (height * height) << endl;
   }

   // Calculate BMI with imperial units
   else
   {
      cout << "Enter your height (in): ";
      cin >> height;
      cout << "\nEnter your weight (lbs): ";
      cin >> weight;
      cout << "\nBMI: " << 703 * weight / (height * height) << endl;
   }

   return 0;
}

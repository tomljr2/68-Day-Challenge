/*
   Day 2: BMI Calculator

   This is a program to calculate a user's BMI from either
   imperial or metric units.
*/
import java.util.Scanner;

public class bmi{
   public static void main(String[] args)
   {
      Integer choice;
      Float weight;
      Float height;
      Scanner scanner = new Scanner(System.in);	// Scanner for stdin

      System.out.print("Choose your units\n\t1.Metric\n\t2.Imperial\nChoice: ");
      choice = scanner.nextInt();
      System.out.println();

      // Calculate the BMI with metric units
      if(choice == 1)
      {
         System.out.print("Enter your height (m): ");
         height = scanner.nextFloat();
         System.out.print("\nEnter your weight (kg): ");
         weight = scanner.nextFloat();
         System.out.println("BMI: " + weight / (height * height));
      }
      // Calculate BMI with imperial units
      else
      {
         System.out.print("Enter your height (in): ");
         height = scanner.nextFloat();
         System.out.print("\nEnter your weight (lbs): ");
         weight = scanner.nextFloat();
         System.out.println("BMI: " + 703 * weight / (height * height));
      }
      scanner.close();
   }
}

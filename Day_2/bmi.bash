#!/bin/bash

#  Day 2: BMI Calculator

#  This is a program to calculate a user's BMI from either
#  imperial or metric units.

echo -ne "Choose your units\n\t1.Metric\n\t2.Imperial\nChoice: "
read choice

# Calculate the BMI with metric units
if [ $choice -eq 1 ]
then
   echo -ne "\nEnter your height (m): "
   read height
   echo -ne "\n\nEnter your weight (kg): "
   read weight
   echo -ne "BMI: "
   echo $(echo "$weight / ($height * $height)" | bc -l)

# Calculate BMI with imperial units
else
   echo -ne "\nEnter your height (in): "
   read height
   echo -ne "\n\nEnter your weight (lbs): "
   read weight
   echo -ne "BMI: "
   echo $(echo "703 * $weight / ($height * $height)" | bc -l)
fi

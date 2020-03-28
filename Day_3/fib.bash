#!/bin/bash

#  Day 3: Fibonnaci Sequence

#  This is a program to print the first n numbers of the fibonacci
#  sequence. It is done with both a while and for loop, and the
#  way it is done is based on a random number. The user will input
#  the value of n.

# Create a random number of 0 or 1
random=$(( RANDOM % 2 ))

echo -n "Enter the number of elements you want from the Fibonacci Sequence (n >= 2): "
read n

# Error checking on n (this is different than c++ / java)
while [ $n -lt 2 ]
do
   echo "Error: Choose n >= 2:"
   read n
done

num1=0
num2=1
echo -ne "\n$num1 $num2 "

# No functions yet (that's tomorrow)
if [ $random -eq 1 ]
then
   # While loop version
   while [ $n -ne 2 ]
   do
      temp=$(( $num1+$num2 ))
      num1=$num2
      num2=$temp
      echo -n "$num2 "
      n=$(( $n-1 ))
   done
else
   # For loop version
   for i in $(seq 0 $(( $n-3 )))
   do
      temp=$(( $num1+$num2 ))
      num1=$num2
      num2=$temp
      echo -n "$num2 "
      n=$(( $n-1 ))
   done
fi
echo

"""
   Day 3: Fibonnaci Sequence

   This is a program to print the first n numbers of the fibonacci
   sequence. It is done with both a while and for loop, and the
   way it is done is based on a random number. The user will input
   the value of n.
"""
import random

# Create a random number of 0 or 1
random = random.randint(0,1);

n = int(input("Enter the number of elements you want " +\
          "from the Fibonacci Sequence (n >= 2): "))

# Error checking on n (this is different than c++ / java)
while n < 2:
   n = int(input("Error: Choose n >= 2: "))
print()

num1 = 0
num2 = 1
print(str(num1) + " " + str(num2) + " ", end = '')

# No functions yet (that's tomorrow)
if random == 1:
   # While loop version
   while n != 2:
      temp = num1 + num2
      num1 = num2
      num2 = temp
      print(str(num2) + " ", end = '')
      n-=1
else:
   # For loop version
   for i in range(n-2):
      temp = num1 + num2
      num1 = num2
      num2 = temp
      print(str(num2) + " ", end = '')
print()

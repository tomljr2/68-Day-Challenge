/*
   Day 3: Fibonnaci Sequence

   This is a program to print the first n numbers of the fibonacci
   sequence. It is done with both a while and for loop, and the
   way it is done is based on a random number. The user will input
   the value of n.
*/
#include <iostream>
#include <stdlib.h>
#include <time.h>
using namespace std;

int main()
{
   // Seed the random number generator and create a random number
   // of 0 or 1.
   srand(time(NULL));
   int random = rand() % 2;

   int n;
   cout << "Enter the number of elements you want " <<
           "from the Fibonacci Sequence (n >= 2): ";

   // Error checking on n
   do
   {
      cin >> n;
      if(n < 2)
         cout << "Error: Choose n >= 2: ";
   }while(n < 2);
   cout << endl;

   int num1 = 0,num2 = 1;
   cout << num1 << " " << num2 << " ";

   // No functions yet (that's tomorrow)
   if(random)
   {
      // While loop version
      while(n != 2)
      {
         int temp = num1 + num2;
         num1 = num2;
         num2 = temp;
         cout << num2 << " ";
         n--;
      }
   }
   else
   {
      // For loop version
      for(int i = 0; i < n-2; i++)
      {
         int temp = num1 + num2;
         num1 = num2;
         num2 = temp;
         cout << num2 << " ";
      }
   }
   cout << endl;

   return 0;
}

/*
   Day 3: Fibonnaci Sequence

   This is a program to print the first n numbers of the fibonacci
   sequence. It is done with both a while and for loop, and the
   way it is done is based on a random number. The user will input
   the value of n.
*/
import java.util.Random;
import java.util.Scanner;

public class fib
{
   public static void main(String[] args)
   {
      // Create a Scanner for stdin
      Scanner scanner = new Scanner(System.in);

      // Create a random number of 0 or 1
      Integer random = (new Random()).nextInt(2);

      Integer n;
      System.out.print("Enter the number of elements you want "+
                         "from the Fibonacci Sequence (n >= 2): ");

      // Error checking on n
      do
      {
         n = scanner.nextInt();
         if(n < 2)
            System.out.print("Error: Choose n >= 2: ");
      }while(n < 2);
      System.out.println();

      Integer num1 = 0, num2 = 1;
      System.out.print(num1 + " " + num2 + " ");

      // No functions yet (that's tomorrow)
      if(random == 1)
      {
         // While loop version
         while(n != 2)
         {
            Integer temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            System.out.print(num2 + " ");
            n--;
         }
      }
      else
      {
         // For loop version
         for(int i = 0; i < n-2; i++)
         {
            Integer temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            System.out.print(num2 + " ");
         }
      }
      System.out.println();
   }
}

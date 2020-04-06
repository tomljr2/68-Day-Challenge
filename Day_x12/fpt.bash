#!/bin/bash

# Day 12: Fermat's Primality Test

# This is an additional program to gain
# experience in bash. I needed it to be small
# because I am currently quite busy.

primalityTest()
{
   # Variable to see if it is probably prime
   composite=-1

   # Test that the parameters were given
   if [ -z $1 ] || [ -z $2 ] || ! [ -z $3 ]
   then
      echo "Error: Incorrect number of parameters. Expected n (number to test) and k (number of tests to perform)."
   else
      # Test that n is correct
      if ! [ $1 -gt 1 ]
      then
         echo "Error: n must be greater than 1."
      else
         # Test that k is correct
         if ! [ $2 -gt 1 ]
         then
            echo "Error: k must be greater than 1."
         else
            # Check the simple cases
            if [ $1 == 2 ] || [ $1 == 3 ]
            then
               composite=2
            else
               # Fermat's Primality Test
               for i in $(seq 0 1 $(( $2-1 )))
               do
                  a=$( shuf -i 2-$(( $1-2 )) -n 1 )
                  res=$(bc <<< "($a^($1-1))%$1")
                  if [ $res != 1 ]
                  then
                     composite=0
                     break
                  fi
               done
               if [ $composite == -1 ]
               then
                  composite=1
               fi
            fi
         fi

         # Result checking
         if [ $composite == 0 ]
         then
            echo "Not prime."
         elif [ $composite == 1 ]
         then
            echo "Probably prime."
         elif [ $composite == 2 ]
         then
            echo "Prime."
         fi
      fi
   fi
}

primalityTest 6869 100

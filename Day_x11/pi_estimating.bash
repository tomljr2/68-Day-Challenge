#!/bin/bash

# Day 11: Pi Estimating / File Writing

# This program is simply to give me more experience with
# bash since I feel that I haven't used it very much

# This is a function that simply writes the second
# argument to a file with the name of the first
# argument
writeTo()
{
   if [ -z $1 ]
   then
      echo "No file name provided."
   else
      if [ -z "$2" ]
      then
         echo "" >> $1
      else
         echo $2 >> $1
      fi
   fi
}

# This is a function that estimates pi based
# on random numbers. It takes in a number of
# random points to generate.
estimatePi()
{
   if [ -z $1 ]
   then
      echo "No number of random points to generate provided."
   else
      inside=0
      num=$(( 2*$1 ))	# Generate a random x and y
      # Generate n random numbers
      rands=( $(awk -v n=$num -v seed="$RANDOM" 'BEGIN { srand(seed); for (i=0; i<n; ++i) printf("%f\n", rand()) }') )
      for i in $(seq 0 2 $(( $num-1 )))
      do
         x=${rands[i]}
         y=${rands[$(( i+1 ))]}

         # See if the point is within the unit circle
         if (( $(echo "(sqrt($x*$x+$y*$y)) <= 1.0" | bc -l) ))
         then
            inside=$(( $inside+1 ))
         fi
      done

      pi=$(echo "4.0*$inside/$1" | bc -l)
      echo $pi
   fi
}

writeTo piEstimates "10: $(estimatePi 10)"
writeTo piEstimates "50: $(estimatePi 50)"
writeTo piEstimates "100: $(estimatePi 100)"
writeTo piEstimates "500: $(estimatePi 500)"
writeTo piEstimates "1000: $(estimatePi 1000)"
writeTo piEstimates "5000: $(estimatePi 5000)"
writeTo piEstimates "10000: $(estimatePi 10000)"

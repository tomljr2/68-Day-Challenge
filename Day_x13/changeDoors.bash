#!/bin/bash

# Day 13: Changing Doors

# A classic gameshow concept is to allow the player
# to choose from three doors and they open one of the doors
# that they did not pick to show that is is empty.
# They give the player the option to switch doors.
# Should they do it?

gameShow()
{
   if [ -z $1 ] || ! [ -z $2 ]
   then
      echo "Error: Must have one parameter. (Number of tests)"
   else
      stayWins=0
      stayCount=0
      switchWins=0
      switchCount=0
      for i in $(seq 0 1 $1)
      do
         # Prize door
         prize=$( shuf -i 1-3 -n 1 )

         # Player chooses a door
         door=$( shuf -i 1-3 -n 1 )

         # Player stays=0, player switches=1
         switch=$( shuf -i 0-1 -n 1 )

         #  Track the number of stays/switches
         if [ $switch == 0 ]
         then
            stayCount=$(( $stayCount+1 ))
         else
            switchCount=$(( $switchCount+1 ))
         fi

         if [ $switch == 0 ] && [ $prize == $door ]
         then
            stayWins=$(( $stayWins+1 ))
         elif [ $switch == 1 ] && [ $prize != $door ]
         then
            switchWins=$(( $switchWins+1 ))
         fi
      done
      echo "Staying winning percentage: " $(bc -l <<< "$stayWins/$stayCount")
      echo "Staying losing percentage: " $(bc -l <<< "1-($stayWins/$stayCount)")
      echo
      echo "Switching winning percentage: " $(bc -l <<< "$switchWins/$switchCount")
      echo "Switching losing percentage: " $(bc -l <<< "1-($switchWins/$switchCount)")
   fi
}

gameShow 1000

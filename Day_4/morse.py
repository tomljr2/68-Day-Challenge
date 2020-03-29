"""
   Day 4: Morse Code Translator

   This is a program to translate english to
   morse code. It explores the world of functions,
   switch statements, and exceptions.
"""

# This allows the user to choose an option
# for the translator
def menu():
   choice = int(input("Morse Code Translator"+\
                       "\n_____________________"+\
                       "\n\t1. Translate character to Morse Code"+\
                       "\n\t2. Translate string to Morse Code"+\
                       "\n\t3.Exit"+\
                       "\nChoice: "))

   # No error checking, just end the program if
   # the user is being annoying
   if choice != 1 and choice != 2 and choice != 3:
      print("Invalid input: Quitting...")
      quit()

   return choice

# Translate to morse code
def english2morse(eng):
   res=''
   for c in eng.lower():
      if c=='a':   res+="·‒"
      elif c=='b': res+="‒···"
      elif c=='c': res+="‒·‒·"
      elif c=='d': res+="‒··"
      elif c=='e': res+="·"
      elif c=='f': res+="··‒·"
      elif c=='g': res+="‒‒·"
      elif c=='h': res+="····"
      elif c=='i': res+="··"
      elif c=='j': res+="·‒‒‒"
      elif c=='k': res+="‒·‒"
      elif c=='l': res+="·‒··"
      elif c=='m': res+="‒‒"
      elif c=='n': res+="‒·"
      elif c=='o': res+="‒‒‒"
      elif c=='p': res+="·‒‒·"
      elif c=='q': res+="‒‒·‒"
      elif c=='r': res+="·‒·"
      elif c=='s': res+="···"
      elif c=='t': res+="‒"
      elif c=='u': res+="··‒"
      elif c=='v': res+="···‒"
      elif c=='w': res+="·‒‒"
      elif c=='x': res+="‒··‒"
      elif c=='y': res+="‒·‒‒"
      elif c=='z': res+="‒‒··"
      else: res+=' '
   return res


stop=False
while not stop:
   choice=menu()
   # Input character, print morse
   if choice == 1:
      try:
         c=input("\nEnter a character: ")
         if not c.isalpha() or len(c) != 1:
            raise Exception()
      except Exception:
         print("Invalid input: Quitting...")
         quit()
      print("\nTranslation: " + english2morse(c))
   # Input string, print morse
   elif choice == 2:
      try:
         s=input("\nEnter a string: ")
         if not s.replace(' ','').isalpha():
            raise Exception()
      except Exception:
         print("Invalid input: Quitting...")
         quit()
      print("\nTranslation: " + english2morse(s))
   elif choice == 3:
      stop=True

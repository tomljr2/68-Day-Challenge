/*
   Day 4: Morse Code Translator

   This is a program to translate english to
   morse code. It explores the world of functions,
   switch statements, and exceptions.
*/
#include <iostream>
#include <string>
#include <cstring>
using namespace std;

int menu();
string english2morse(string);
string english2morse(char);

int main()
{
   bool stop=0;
   while(!stop)
   {
      switch(menu())
      {
         // Input character, print morse
         case 1: {char c;
                 cout << "\nEnter a character: ";
                 try{
                    cin >> c;
                 }
                 catch(int e){
                    cout << "Invalid input: Quitting...\n";
                    return -1;
                 }
                 cout << "\nTranslation: "
                      << english2morse(c) << endl;
                 break;}
         // Input string, print morse
         case 2: {string s("");
                 cout << "\nEnter a string: ";
                 try{
                    getline(cin>>ws,s);
                 }
                 catch(int e){
                    cout << "Invalid input: Quitting...\n";
                    return -1;
                 }
                 cout << "\nTranslation: "
                      << english2morse(s) << endl;
                 break;}
         case 3: {stop=1;}
      }
   }

   return 0;
}

// This allows the user to choose an option
// for the translator
int menu()
{
   int choice;
   cout << "Morse Code Translator"
        << "\n_____________________"
        << "\n\t1. Translate character to Morse Code"
        << "\n\t2. Translate string to Morse Code"
        << "\n\t3.Exit"
        << "\nChoice: ";

   // No error checking, just end the program if
   // the user is being annoying
   try{
      cin >> choice;
      if(choice < 1 || choice > 3)
         throw 1;
   }
   catch(int e){
      cout << "Invalid input: Quitting...\n";
      exit(-1);
   }
   return choice;
}

// Translate a string to morse code
string english2morse(string eng)
{
   string res("");
   for(int i=0; i < eng.length();i++)
   {
      switch(tolower(eng[i]))
      {
         case 'a': res+="·‒";break;
         case 'b': res+="‒···";break;
         case 'c': res+="‒·‒·";break;
         case 'd': res+="‒··";break;
         case 'e': res+="·";break;
         case 'f': res+="··‒·";break;
         case 'g': res+="‒‒·";break;
         case 'h': res+="····";break;
         case 'i': res+="··";break;
         case 'j': res+="·‒‒‒";break;
         case 'k': res+="‒·‒";break;
         case 'l': res+="·‒··";break;
         case 'm': res+="‒‒";break;
         case 'n': res+="‒·";break;
         case 'o': res+="‒‒‒";break;
         case 'p': res+="·‒‒·";break;
         case 'q': res+="‒‒·‒";break;
         case 'r': res+="·‒·";break;
         case 's': res+="···";break;
         case 't': res+="‒";break;
         case 'u': res+="··‒";break;
         case 'v': res+="···‒";break;
         case 'w': res+="·‒‒";break;
         case 'x': res+="‒··‒";break;
         case 'y': res+="‒·‒‒";break;
         case 'z': res+="‒‒··";break;
         default: res+=' ';break;
      }
   }
   return res;
}

// Translate a character to morse code
string english2morse(char eng)
{
   string s(1,eng);
   return english2morse(s);
}

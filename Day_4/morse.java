/*
   Day 4: Morse Code Translator

   This is a program to translate english to
   morse code. It explores the world of functions,
   switch statements, and exceptions.
*/
import java.util.Scanner;
import java.lang.*;

public class morse
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      Boolean stop = false;
      while(!stop)
      {
         switch(menu())
         {
            // Input character, print morse
            case 1: Character c;
                    System.out.print("\nEnter a character: ");
                    try{
                       c=scanner.next().charAt(0);
                    }
                    catch(Exception e){
                       System.out.println("Invalid input: Quitting...");
                       return;
                    }
                    System.out.println("\nTranslation: "+english2morse(c));
                    break;
            // Input string, print morse
            case 2: String s = new String();
                    System.out.print("\nEnter a string: ");
                    try{
                       s=scanner.nextLine();
                    }
                    catch(Exception e){
                       System.out.println("Invalid input: Quitting...");
                       return;
                    }
                    System.out.println("\nTranslation: "+english2morse(s));
                    break;
            case 3: stop=true;
         }
      }
   }

   // This allows the user to choose an option
   // for the translator
   private static Integer menu()
   {
      Scanner scanner = new Scanner(System.in);

      Integer choice;
      System.out.print("Morse Code Translator"+
                       "\n_____________________"+
                       "\n\t1. Translate character to Morse Code"+
                       "\n\t2. Translate string to Morse Code"+
                       "\n\t3.Exit"+
                       "\nChoice: ");

      // No error checking, just end the program if
      // the user is being annoying
      try{
         choice = scanner.nextInt();
         if(choice < 1 || choice > 3)
            throw new Exception();
      }
      catch(Exception e){
         System.out.println("Invalid input: Quitting...");
         choice=-1;
         System.exit(-1);
      }
      return choice;
   }

   // Translate a string to morse code
   private static String english2morse(String eng)
   {
      String res = new String();
      for(int i=0; i < eng.length();i++)
      {
         switch(Character.toLowerCase(eng.charAt(i)))
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
   private static String english2morse(Character eng)
   {
      return english2morse(new String(""+eng));
   }
}

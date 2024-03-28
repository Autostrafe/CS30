// Program name: A* Input Basics

// Student name: Levi Bautista

// Date: 3/27/2024

// Program Description: input two ints and add them together, input two doubles and add them together


import static java.lang.System.*;

import java.util.Scanner;

public class App

{

  public static void main (String[] args) {

      Scanner keyboard = new Scanner(System.in);

      int intOne, intTwo; 

      System.out.print("Enter an integer :: ");

      intOne = keyboard.nextInt();


      System.out.print("Enter an integer :: ");

      intTwo = keyboard.nextInt();

 
      System.out.println("integer one = " + intOne);

      System.out.println("integer two = " + intTwo);

      System.out.println("Your two numbers equals " + (intTwo + intOne));

      

      
      double dbOne, dbTwo; 

      System.out.print("Enter an double :: ");

      dbOne = keyboard.nextDouble();


      System.out.print("Enter an double :: ");

      dbTwo = keyboard.nextDouble();

 
      System.out.println("double one = " + dbOne);

      System.out.println("double two = " + dbTwo);

      System.out.println("Your two numbers equals " + (dbTwo + dbOne));

   }

}
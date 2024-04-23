import java.util.Scanner;
import java.lang.Math;

public class MilesPerHour{
    private static double distance, speed, time;
    private static double minutes, hours, hoursConv;
 
    public static void input(){

         Scanner input = new Scanner(System.in);

         System.out.print("Enter the distance: ");

         double userNum1 = input.nextDouble();

         distance = userNum1;

         System.out.print("Enter the hours: ");

         double userNum2 = input.nextDouble();

         hours = userNum2;

         System.out.print("Enter the minutes: ");

         double userNum3 = input.nextDouble();

         minutes = userNum3;
    }

    public static void calculate(){
      hoursConv = minutes/60;
    
      time = hours + hoursConv;
    
      speed = distance/time;

    }

    public static void print(){

      System.out.println((int) Math.floor(distance) + " mile(s) in " + (int) Math.floor(hours) + " hour(s) and " + (int) Math.floor(minutes) + " minute(s) = " + (int) Math.floor(speed) + " MPH");
      
    }

}
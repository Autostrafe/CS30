import java.util.Scanner;

public class LeapYear{

    private static int inputNum;
    private static boolean checkCent;

    public static void input(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year :: ");

        int inputYear = input.nextInt();

        boolean checkLeap = ((inputYear % 4 == 0) && inputYear % 100 !=0) || (inputYear % 400 == 0);

        if (checkLeap){
            System.out.println(inputYear + " is a leap year");
        }
        else{
            System.out.println(inputYear + " is NOT a leap year");
        }
    }
}
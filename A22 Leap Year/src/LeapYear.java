import java.util.Scanner;

public class LeapYear{

    private static int inputNum;
    private static boolean checkCent;

    public static void input(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year :: ");

        int inputNum = input.nextInt();

        if (inputNum%400 == 0 ){
            checkCent = true;
            if (checkCent){
                if (inputNum%4 == 0 ){
                    System.out.println(inputNum + " is a leap year");
                }
                else {
                    checkCent = false;
                    System.out.println(inputNum + " is NOT a leap year");
                }
                
            }

        }

    }

}
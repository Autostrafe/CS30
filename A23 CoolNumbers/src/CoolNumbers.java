import java.util.Scanner;

public class CoolNumbers{

    private static int coolNumCount, userNum;

    public static void input(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check how many cool numbers there are within 6 to you number :: ");

        int userInput = input.nextInt();

        userNum = userInput;

    }

    public static boolean isCoolNum(int i){     
        if (i % 3 ==1 && i % 4 ==1 && i % 5 ==1 && i % 6 ==1){
            return true;
        
        }
        else{
            return false;
        }
         
    }

    public static void countCoolNumbers(int n){
        coolNumCount = 0;
        for (int i = 6; i < n; i++){
            if (isCoolNum(i)){
                coolNumCount++;
            }
         }
    }

    public static void printCoolNum(){
        System.out.println(coolNumCount + " cool numbers between 6 - " + userNum);

    }

    public static void executeAll(){
        input();
        isCoolNum(userNum);
        countCoolNumbers(userNum);
        printCoolNum();

    }
}
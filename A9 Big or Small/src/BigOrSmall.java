import static java.lang.System.*; 
import java.util.Scanner;

public class BigOrSmall {

    Scanner scanner = new Scanner(System.in); 


    public static void check (int a , int b)
    {

        if (a > b){
            System.out.println("yes");
        }
        if (a < b){
            System.out.println("no");
        }
        else
        {
            System.out.println("equals");
        }
        Scanner.nextLine();
    }
}

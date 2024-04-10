import static java.lang.System.*; 
import java.util.Scanner;

public class BigOrSmall {

    public static void check (int a , int b)
    {
        if (a > b){
            System.out.println("yes");
        }
        else if (a < b){
            System.out.println("no");
        }
        else
        {
            System.out.println("equals");
        }
    }
}

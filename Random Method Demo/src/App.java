import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // System.out.println("Enter an integer: ");
        // int int1 = input.nextInt();

        // System.out.println("Enter another integer: ");
        // int int2 = input.nextInt();

        // System.out.println("Enter a decimal number: ");
        // double dbl1 = input.nextDouble();

        // System.out.println("Enter a second decimal number: ");
        // double dbl2 = input.nextDouble();

        for (int i = 0; i <10 ; i++){
            System.out.println("The number is: " + rdmInt(10,30));
        }
       

    }

    // Custom Random Double Generator
    public static double rdmDbl(double max){
        //generate random double between 0 and max
        double genDbl = Math.random() * max;




        return genDbl;
    }

    public static int rdmInt(int min, int max){
        //generate random double between 0 and max
        double genInt = Math.random()* (max - min) + min;
        
        //Cast double as an int to drop the decimals
        return (int) genInt;
    }

}

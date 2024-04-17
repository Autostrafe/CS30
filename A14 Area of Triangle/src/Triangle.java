import java.util.Scanner;
import java.lang.Math;

public class Triangle{

    private static double setNum1,setNum2,setNum3;
    private static double side, perimeter, area;

    private static double num1,num2,num3;

    public static void setNumsANDsetVar(double a, double b, double c){

        setNum1 = a;
        setNum2 = b;
        setNum3 = c;

        perimeter = a + b + c;

        side = perimeter/2;

    }

    public static void calculate(){

        area = Math.sqrt(side * ( ( side-setNum1 )*( side - setNum2 )*( side - setNum3 )) );
        System.out.println("Area = " + area);

    }

    public static void input(){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter side A: ");

        double userChoiceSideA = userInput.nextDouble();

        num1 = userChoiceSideA;

        System.out.println("Enter side B: ");

        double userChoiceSideB = userInput.nextDouble();
 
        num2 = userChoiceSideB;

        System.out.println("Enter side C: ");

        double userChoiceSideC = userInput.nextDouble();
 
        num3 = userChoiceSideC;

        setNumsANDsetVar(num1,num2,num3);
        print();

    }

    public static void print(){

        System.out.println(setNum1 +""+ setNum2 +""+ setNum3);
        calculate();




    }

}
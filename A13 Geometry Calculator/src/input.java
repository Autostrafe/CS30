import java.util.Scanner;

public class input {

    private static double num1,num2;
    
    public static void input(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Which Calculator would you want to use? Perimeter of Rectangle [TYPE \"1\"], Surface Area of a Cube [Type \"2\"], or Area of a Circle [Type \"3\"]");

        String userChoice = userInput.next();

        if(!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")){

            input.input();

        }


        if (userChoice.equals("1")){

            System.out.println("This is a calculator for Perimeter of a Rectangle. Formula: P = 2L + 2W or 2( L + W ) ");

            System.out.println("Enter width: ");

            double userChoiceWidth = userInput.nextDouble();

            num1 = userChoiceWidth;

            System.out.println("Enter Length: ");

            double userChoiceLength = userInput.nextDouble();

            num2 = userChoiceLength;

            ILikeLongNamesBecauseItsVeryCoolButThisIsAGeometryCalculator.iLikeLongNamesBecauseItsVeryCoolButThisIsACalculatorForPerimeterOfARectangle(num1,num2);

        }

        
        if (userChoice.equals("2")){

            System.out.println("This is a calculator for the Surface Area of a Rectangle. Formula: SA = 6s^2 ");

            System.out.println("Enter a side number: ");

            double userChoiceCube = userInput.nextDouble();

            ILikeLongNamesBecauseItsVeryCoolButThisIsAGeometryCalculator.iLikeLongNamesBecauseItsVeryCoolButThisIsACalculatorForSurfaceAreaOfCube(userChoiceCube);

        }

        if (userChoice.equals("3")){

            System.out.println("This is a calculator for the Area of a circle. Formula: A = πr2 or A = Pi * r2");

            System.out.println("Enter a radius: ");

            double userChoiceCircle = userInput.nextDouble();

            ILikeLongNamesBecauseItsVeryCoolButThisIsAGeometryCalculator.iLikeLongNamesBecauseItsVeryCoolButThisIsACalculatorForAreaOfACircle(userChoiceCircle);

        
        }
    }

}

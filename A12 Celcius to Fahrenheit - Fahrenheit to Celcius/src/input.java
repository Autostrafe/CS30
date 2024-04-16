import java.util.Scanner;

public class input {

    public static void input(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to convert from Fahrenheit to Celsius [TYPE \"1\"] or convert Celsius to Fahrenheit [Type \"2\"]");

        String userChoice = userInput.next();

        if(!userChoice.equals("1") && !userChoice.equals("2")){

            input.input();

        }



        if (userChoice.equals("1")){

            Scanner userInput2 = new Scanner(System.in);
            System.out.println("Enter a number to convert from Fahrenheit to Celsius");

            double userChoiceFahr = userInput.nextDouble();

            FtoC.setNums(userChoiceFahr);
            FtoC.convert();
            FtoC.print();
        }

        
        if (userChoice.equals("2")){

            Scanner userInput2 = new Scanner(System.in);
            System.out.println("Enter a number to convert from Celsius to Fahrenheit");

            double userChoiceCels = userInput.nextDouble();

            CtoF.setNums(userChoiceCels);
            CtoF.convert();
            CtoF.print();
        }
    }

}

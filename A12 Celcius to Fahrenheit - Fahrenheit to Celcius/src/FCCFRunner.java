import java.util.Scanner;

public class FCCFRunner {
    private double num;

    public static void main(){
     

        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to convert from Fahrenheit to Celcius [TYPE \"1\"] or convert Celcius to Fahrenheit [Type \"2\"]");

        String userChoice = userInput.nextLine();

        if (userChoice == "1"){

            Scanner userInput2 = new Scanner(System.in);

            FtoC.setNums(98.6);
        }


    }
 

}

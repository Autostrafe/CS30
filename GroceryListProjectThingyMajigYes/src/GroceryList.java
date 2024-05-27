import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList{

    ArrayList<String> grocery = new ArrayList<String>();
    boolean statement = true;

    public void list(){

    while (statement){

        System.out.println("This is your grocery list.");

        for (int i = 0; i < grocery.size(); i++){
            System.out.println(grocery.get(i));

        }
        
        askANDadd();
    }

    }

    public void askANDadd(){
    
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to add more to your list? Yes [1] or No [2]");

        String answer = input.next();

        clearScreen();

        if (answer.equals("1")){
            System.out.println("What would you like to add?");
            String addList = input.next();

            grocery.add(addList);

            clearScreen();
        }

        else if (answer.equals("2")){
            System.out.println("This is your finalized list:");
            for (int i = 0; i < grocery.size(); i++){
                System.out.println(grocery.get(i));
    
            }

            statement = false;

        }

        else {
            System.out.println("Please enter a valid input");
            askANDadd();
        }

    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  


}
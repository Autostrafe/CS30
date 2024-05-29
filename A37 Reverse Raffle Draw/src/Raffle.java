import java.util.ArrayList;
import java.lang.Thread;
import java.util.Scanner;
import java.util.Random;

public class Raffle {

    static ArrayList<String> names = new ArrayList<String>();
    static ArrayList<String> namesRemoved = new ArrayList<String>();
    static Scanner input = new Scanner (System.in);
    static Random rand = new Random();

    public static void enterNames() throws InterruptedException{

        System.out.println("This is the reverse Raffle, 10+ names will be put into the hat \n and the last name to be picked out will win.");
        Thread.sleep(100);


        for (int i = 0; i<10; i++){

            System.out.println("Enter a name " + i + "/10");

            String answer = input.next();

            names.add(answer);
            namesRemoved.add(answer);

            clearScreen();

        }


            
        int rand_int = rand.nextInt(names.size());

        String element = names.get(rand_int);
        
        names.clear();
        names.add(element);
            

        namesRemoved.remove(names.get(0));

        System.out.println("These the names removed");
        for (int i = 0; i< namesRemoved.size(); i++){
            System.out.println(namesRemoved.get(i));
            Thread.sleep(100);
        }

        System.out.println("And this is the winner: " + names);
       

    }

    public static void addMore(){


        System.out.println("Do you want to add more names? Yes [1] or No [2]");

    

    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  


}

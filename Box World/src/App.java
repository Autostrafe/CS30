import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BoxWorld bWorld = new BoxWorld();
        
        Scanner input = new Scanner(System.in);


        System.out.println("Type a word");
        String userIn = input.next();

        bWorld.countDemLetters(userIn);
        bWorld.repeatDemWords(userIn);
    }
}

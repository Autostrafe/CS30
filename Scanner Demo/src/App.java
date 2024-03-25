import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner keys = new Scanner(System.in);
        Scanner keys2 = new Scanner(System.in);
        
        // System.out.println("Scanner Demo Inputs");
        // // Int Input
        // System.out.println("Integers: ");
        // int num = keys.nextInt();
        // System.out.println("The Number Was: " + num);
        // // Double Input
        
        // System.out.println("Double: ");
        // double num2 = keys.nextInt();
        // System.out.println("The Number Was: " + num2);

        System.out.print("Enter an Integer:");
        int num3 = keys.nextInt();

        System.out.print("Enter a Sentence");
        String sentence = keys2.nextLine();

        System.out.println(num3 + " " + sentence);



    }
}

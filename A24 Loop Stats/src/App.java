import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        LoopStats LoopStats = new LoopStats();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your starting number :: ");
        int startNum = input.nextInt();
        System.out.print("Enter your ending number :: ");
        int endNum = input.nextInt();

        LoopStats.setNums(startNum, endNum);
        LoopStats.execAll();
        System.out.println(LoopStats);
    }
}

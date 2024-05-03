public class RandomTask {

    private static int rdmNum1,rdmNum2;

    public static void rdmGen(){

        double genNum1 = Math.random() * (500 + 500) - 500;
        rdmNum1 = (int) genNum1;

        double genNum2 = Math.random() * (500 + 500) - 500;
        rdmNum2 = (int) genNum2;


    }
    

    public static void printANDexec(){
        System.out.println("Here are two random numbers");
        System.out.println(rdmNum1 + " and " + rdmNum2);
        

        if (rdmNum1 < rdmNum2){
            System.out.println(rdmNum1+ " is the lower number");
            System.out.println(rdmNum2+ " is the higher number");
        }
        else if (rdmNum1 > rdmNum2){
            System.out.println(rdmNum2 + " is the lower number");
            System.out.println(rdmNum1 + " is the higher number");
        }
        else{
            System.out.println("They are the same number");
        }
    }

}

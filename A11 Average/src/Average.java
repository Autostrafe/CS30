public class Average {

    private static double setNum1, setNum2;
    private static double answer;

    public static void setNum(double a, double b){

        setNum1 = a;
        setNum2 = b;

    }
    
    public static void calculate(){
        
        answer = (setNum1 + setNum2)/2;


    }

    public static void print(){

        System.out.println(answer);

    }

    
}

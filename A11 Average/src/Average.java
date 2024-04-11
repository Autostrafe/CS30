public class Average {

    private static double setNum;
    private static double answer;

    public static void setNum(double a){

        setNum = a;

    }
    
    public static void calculate(){
        
        answer = setNum/2;


    }

    public static void print(){

        System.out.println(answer);

    }

    
}

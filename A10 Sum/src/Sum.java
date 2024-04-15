
public class Sum {

    private static int setNum1, setNum2;
    private static int sum;

    public static void setNums(int a, int b){

        setNum1 = a;
        setNum2 = b;

    }
    
    public static void dimSum(){
        
        sum = setNum1 + setNum2;

    }

    public static void print(){
        System.out.println(sum);

    }


}
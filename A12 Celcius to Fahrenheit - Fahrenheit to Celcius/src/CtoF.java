public class CtoF {

    private static double setNum1;
    private static double celsTOFahr;

    public static void setNums(double a){
        setNum1 = a;
    }

    public static void convert(){
        celsTOFahr = ((setNum1) *9 / 5) + 32;
    }

    public static void print(){
        System.out.println(celsTOFahr + "°C");
    }


}
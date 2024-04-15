public class FtoC {
    private static double setNum1;
    private static double fahrTOcelc;

    public static void setNums(double a){
        setNum1 = a;
    }

    public static void convert(){
        fahrTOcelc = (setNum1 - 32) *5 / 9;
    }

    public static void print(){
        System.out.println(fahrTOcelc);
    }



}

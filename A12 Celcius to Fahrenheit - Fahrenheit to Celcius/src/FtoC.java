public class FtoC {
    private static double setNum1;
    private static double fahrTOcels;

    public static void setNums(double a){
        setNum1 = a;
    }

    public static void convert(){
        fahrTOcels = (setNum1 - 32) *5 / 9;
    }

    public static void print(){
        System.out.println(fahrTOcels + "°C");
    }



}

public class BoxWorld{

    private int lengthNum;

    public void countDemLetters(String x){

        lengthNum = x.length() - 1;

    }

    public void repeatDemWords(String x){

        for (int i = 1; i <= lengthNum; i++){
            System.out.println(x);
        }

    }

}
public class FarmRunner {
    public static void main(String[] args) throws Exception {

        Turkey bird = new Turkey();
        Pig pig = new Pig();

        pig.speak();        
        bird.speak();
        bird.sayName();

    }
}

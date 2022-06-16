package chapter10;

public class Dog extends Animals {

    @Override
    public void makesSound() {
        System.out.println("woof!");
    }

    public void fetch() {
        System.out.println("Fetching is fun!");
    }
}

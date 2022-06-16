package chapter10;

public class Cat extends Animals {

    @Override
    public void makesSound() {
        System.out.println("meow!");
    }

    public void scratch() {
        System.out.println("I am a cat. I scratch things.");
    }
}

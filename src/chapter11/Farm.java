package chapter11;

public class Farm {

    public static void main(String[] args) {

        Animal duck = new Duck();
        duck.makeSound();

        Duck ducky = new Duck();
        ducky.makeSound();

        Pig piggy = new Pig();
        piggy.makeSound();
    }
}

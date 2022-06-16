package chapter10;

public class Market {

    public static void main(String[] args) {

        Fruit apple = new Apple();
        ((Apple) apple).removeSeeds();

        Apple apple2 = new Apple();
        apple2.removeSeeds();

        Banana banana = new Banana();
        banana.peel();

        Fruit banana2 = new Banana();
        ((Banana) banana2).peel();

        Fruit orange = new Fruit();
        squeeze(orange);
    }

    public static void squeeze(Fruit fruit) {
        System.out.println("Squeezing...");
        fruit.makeJuice();
    }
}

package chapter10;

public class Banana extends Fruit {

    public Banana() {
        setCalories(87);
    }

    @Override
    public void makeJuice() {
        System.out.println("make banana juice");
    }

    public void peel() {
        System.out.println("Peel the banana before eating");
    }
}

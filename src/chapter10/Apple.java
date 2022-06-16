package chapter10;

public class Apple extends Fruit {

    public Apple() {
        setCalories(99);
    }

    @Override
    public void makeJuice() {
        System.out.println("Make apple juice");
    }

    public void removeSeeds() {
        System.out.println("Please, do not eat the seed");
    }
}

package chapter10;

public class Zoo {

    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.makesSound();
        rocky.fetch();
        feed(rocky);

        Animals bingo = new Dog();
        bingo.makesSound();
        feed(bingo);

        bingo = new Cat();
        bingo.makesSound();
        feed(bingo);

        // You can't make calls to method in Cat and Dog class
        // Since bingo is of type Animal
        // However, you can work around it by doing type casting.

        ((Cat) bingo).scratch();
        bingo.makesSound();
        feed(bingo);

    }

    public static void feed(Animals animal) {
        if (animal instanceof Cat) {
            System.out.println("Hey, here is your cat food");
        }
        else if (animal instanceof Dog) {
            System.out.println("Hey, here is your dog food");
        }
    }
}

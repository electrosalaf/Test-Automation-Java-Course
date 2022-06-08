package chapter2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        System.out.println("What season of the year are we?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("What does the weather feels like? ");
        String weather = scanner.next();

        System.out.println("How many cup of coffee did you take?");
        int numberOfCoffee = scanner.nextInt();

        System.out.println("On a " + weather + " " + season +
                " day, I drink a minimum of " + numberOfCoffee + " cups of coffee."
        );
    }
}

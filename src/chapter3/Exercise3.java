package chapter3;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        // Initiate the known value
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.1;
        double quarter = 0.25;
        int dollar = 1;

        // Get unknown value
        System.out.println("Enter the number of pennies you have:");
        Scanner scanner = new Scanner(System.in);
        int numberOfPennies = scanner.nextInt();

        System.out.println("Enter the number of nickels you have:");
        int numberOfNickels = scanner.nextInt();

        System.out.println("Enter the number of dimes you have:");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter the number of quarters you have:");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double total = numberOfPennies * penny + numberOfNickels * nickel
                + numOfDimes * dime + numOfQuarters * quarter;

        if (total == dollar) {
            System.out.println("You won, it's exactly $" + dollar);
        }
        else if (total > dollar){
            double over = total - dollar;
            System.out.println("You are " + String.format("%.2f", over) + " over");
        } else {
            double less = dollar - total;
            System.out.println("You are " + String.format("%s.2f", less) + " less");
        }
    }
}

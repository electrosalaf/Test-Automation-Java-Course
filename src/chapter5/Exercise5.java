package chapter5;

import java.util.Scanner;

public class Exercise5 {

    static double overageCharges = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double baseCost = getBaseCost();
        double overageTime = getOverageTime();
        double overageFees = calculateOverageFees(overageTime);
        double totalTax = calculateTax(baseCost, overageFees);

        double total = calculateTotal(baseCost, overageFees, totalTax);

        scanner.close();

        displayResult(baseCost, overageFees, totalTax, total);
    }

    public static double getBaseCost() {
        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();
        return baseCost;
    }

    public static double getOverageTime() {
        System.out.println("Enter overage minutes:");
        double overageTime = scanner.nextDouble();
        return overageTime;
    }

    private static double calculateOverageFees(double overageTime) {

        double overageFees = 0;

        if (overageTime > 0) {
            overageFees = overageTime * overageCharges;
        } else {
            System.out.println("Sorry, your input is not valid. Try a positive number instead.");
        }
        return overageFees;
    }

    private static double calculateTax(double baseCost, double overageFees) {
        double totalTax = tax * (baseCost + overageFees);
        return totalTax;
    }

    private static double calculateTotal(double baseCost, double overageFees, double totalTax) {
        double total = baseCost + overageFees + totalTax;
        return total;
    }

    private static void displayResult(double baseCost, double overageFees, double tax, double total) {
        System.out.println("Phone Bill Statement:");
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + overageFees);
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
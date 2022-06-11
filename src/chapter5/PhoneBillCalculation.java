package chapter5;

import java.util.Scanner;

///
public class PhoneBillCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();

        double overageCharge = calculateOverages(overageMinutes);

        double tax = calculateTax(baseCost + overageCharge);

        calculateAndPrintBill(baseCost, overageCharge, tax);
    }

    public static double calculateOverages(double extraTime) {
        double rate = 0.25;
        double overage = rate * extraTime;
        return overage;
    }

    private static double calculateTax(double subtotal) {
        double rate = 0.15;
        double tax = rate * subtotal;
        return tax;
    }

    private static void calculateAndPrintBill(double base, double overage, double tax) {
        double finalTotal = base + overage + tax;
        System.out.println("Phone Bill Statement:");
        System.out.println("Plan: $" + base);
        System.out.println("Overage: $" + overage);
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}

package chapter3;

import java.util.Scanner;

/**
 * All salespeople get a salary of $1000 per week.
 * Additionally, $250 bonus for exceeding 10 sales per week.
 */
public class SalaryCalculator {

    public static void main(String[] args) {

        // Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Get values for the unknown
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Quick detour for the bonus earners
        if (sales > quota) {
            salary += bonus;
        }

        // Output
        System.out.printf("The employee's pay is $: " + salary);
    }
}

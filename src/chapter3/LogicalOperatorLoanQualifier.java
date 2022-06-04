package chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String[] args) {

        // Initiate what you know
        int requiredSalary = 3000;
        int requiredYearsEmployed = 2;

        // Get the unknown
        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer: ");
        double years = scanner.nextDouble();

        scanner.close();

        // Make the decision
        if (salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.println("Congratulations, you qualify for the loan!");
        }
        else {
            System.out.println("You must earn at least $ "
                    + requiredSalary + " to qualify for the loan!");
        }
    }
}

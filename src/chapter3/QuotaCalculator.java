package chapter3;

import java.util.Scanner;

/**
 * All salesperson are required to make at least 10 sales per week.
 * If successful, they are greeted with a congratulatory message.
 * Else, they are informed how many sales they are short of.
 */
public class QuotaCalculator {

    public static void main(String[] args) {

        // Initialize the value we know
        int quota = 10;

        // Get the unknown values
        System.out.println("Enter your weekly sales: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        // Make decision on the part to take - Output
        if (sales >= quota) {
            System.out.println("Congratulations, you beat your quota");
        } else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were "
                    + salesShort + " sales short."
            );
        }
    }
}

package chapter7;

import java.util.Scanner;

public class DaysOfTheWeek {

    public static void main(String[] args) {

        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a corresponding digit for the day of the week:");
        int index = scanner.nextInt();
        scanner.close();

        System.out.println("The corresponding day: " + daysOfTheWeek[index - 1]);
    }
}

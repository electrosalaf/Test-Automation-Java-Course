package chapter4;

import java.util.Random;

/**
 * The objective of this game is to travel entire game board of 20 spaces within 5 die rolls.
 * STEPS:
 * Generate a random number between 1 - 6 and advance the user that number of spaces on game board.
 * After each roll, tell user which game space they are on and how many spaces they have to go to win.
 * Repeat this 4 additional times for 5 rolls in total
 * If user gets 20 before 5 rolls, end the game, and they won.
 * If greater than or less than 20 exactly, they lose.
 */
public class Exercise4 {

    public static void main(String[] args) {

        // Initialize the known
        int numberOfRolls = 5;
        int totalSpaces = 20;
        int currentRoll = 0;

        Random random = new Random();

        for (int i = 0; i < numberOfRolls; i++) {

            int die = random.nextInt(6) + 1;
            currentRoll += die;

            System.out.println(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if (currentRoll == totalSpaces) {
                System.out.println("You're on space " + currentRoll + ". Congrats , you win!");
                break;
            } 
            else if (currentRoll > totalSpaces) {
                System.out.println("You are past " + totalSpaces + " spaces. You lose!");
                break;
            } else if (i == numberOfRolls && currentRoll < totalSpaces) {
                System.out.println("You're on space " + currentRoll + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        totalSpaces + " spaces. You lose!");
                break;
            }
            else {
                int spacesToGo = totalSpaces - currentRoll;
                System.out.println("You are now on space " + currentRoll +
                        " and have " + spacesToGo + " more to go!");
            }

            System.out.println();
        }
    }
}

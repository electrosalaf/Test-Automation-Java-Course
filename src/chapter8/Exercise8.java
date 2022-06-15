package chapter8;

import java.util.Scanner;

/**
 * Create a password validator that conforms to the following conditions:
 * at least 8 characters long, contains uppercase, contains special character
 * not contain username and not same as old password
 */
public class Exercise8 {

    private static final int PASSWORD_LENGTH = 8;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static String getUsername() {
        System.out.println("Enter your username: ");
        String username = scanner.next();
        return username;
    }

    public static String getPassword() {
        System.out.println("Enter your password: ");
        String password = scanner.next();
        return password;
    }

    public static void countPassword(String password) {
        var words = password.split(" ");
        int numberOfWords = words.length;

        var modifiedPassword = new StringBuilder(password);
        if (numberOfWords >= PASSWORD_LENGTH) {
            for (int i = 0; i < numberOfWords; i++) {
                if (Character.isUpperCase(modifiedPassword.charAt(i))) {

                }
            }
        }
    }
}

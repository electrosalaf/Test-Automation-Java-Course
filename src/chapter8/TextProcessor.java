package chapter8;

public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love Java");
        reverseString("Ibrahim");
        addSpaces("ILoveJava");
    }

    /**
     * Split a string into an array by tokenizing it.
     * Counts the word and prints them.
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("The text contains %d words", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a string in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0 ; i--) {
            System.out.println(text.charAt(i));
        }
    }

    /**
     * Add spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text) {
        
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}

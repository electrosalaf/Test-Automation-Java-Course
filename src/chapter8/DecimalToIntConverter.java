package chapter8;

public class DecimalToIntConverter {

    public static void main(String[] args) {
        convertDecimalToInt();
    }

    public static void convertDecimalToInt() {

        double[] numbers = {2.34, 4.67, 5.89, 7.65};

        for (Double number : numbers) {
            System.out.print(number.intValue() + " | ");
        }
    }
}

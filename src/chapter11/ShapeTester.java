package chapter11;

public class ShapeTester {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(4, 2);
        rectangle.print();
        System.out.println(rectangle.calculatePerimeter());
    }
}

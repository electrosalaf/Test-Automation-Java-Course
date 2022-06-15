package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square");
    }

    public void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(8);
        rectangle.setWidth(4);
        System.out.println("The perimeter of the rectangle is: " + rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println("The perimeter of the square is: " + square.calculatePerimeter());
    }
}

package chapter6;

public class Rectangle {

    double length;
    double width;

    double getLength() {
        return length;
    }

    void setLength() {
        this.length = length;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    double calculateArea() {
        return length * width;
    }
}

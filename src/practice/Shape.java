package practice;

public class Shape {
    public void area(int radius) {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }

    public void area(int length, int width) {
        System.out.println("Area of rectangle: " + (length * width));
    }

    public void area(double side) {
        System.out.println("Area of square: " + (side * side));
    }

public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(5); // Area of circle
        shape.area(4, 6); // Area of rectangle
        shape.area(3.0); // Area of square
    }



}
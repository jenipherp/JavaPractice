package practice;

public class MathOperations {

    public int square(int num) {
        int result = num * num;
        return result;
    }

    public int cube(int num) {
        int result = num * num * num;
        return result;
    }
    
    public static void main(String[] args) {
        // Main method
        MathOperations obj = new MathOperations();
        int s = obj.square(5);
        int c = obj.cube(3);
        System.out.println("square(5) = " + s);
        System.out.println("cube(3) = " + c);
    }
}
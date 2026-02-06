import java.util.*;
public class Q1 {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(subtract(5, 2));
        System.out.println(multiply(4, 3));
        System.out.println(divide(10, 2));
    }
}

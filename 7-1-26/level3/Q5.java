package level3;

import java.util.*;

public class Q5 {

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;
        return true;
    }

    public static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int[] digits = storeDigits(square);
        int sum = 0;
        for (int d : digits)
            sum += d;
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int[] digits = storeDigits(num);
        int sum = 0;
        int product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Is Prime Number: " + isPrime(num));
        System.out.println("Is Neon Number: " + isNeon(num));
        System.out.println("Is Spy Number: " + isSpy(num));
        System.out.println("Is Automorphic Number: " + isAutomorphic(num));
        System.out.println("Is Buzz Number: " + isBuzz(num));
    }
}

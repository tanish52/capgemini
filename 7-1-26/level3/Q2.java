package level3;
import java.util.*;

public class Q2 {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        int n = countDigits(num);
        int[] digits = new int[n];
        int temp = num;
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++)
            if (digits[i] != 0)
                return true;
        return false;
    }

    public static boolean isArmstrongNumber(int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, n);
        int original = 0;
        for (int d : digits)
            original = original * 10 + d;
        return sum == original;
    }

    public static int[] largestAndSecondLargest(int[] digits) {
        Arrays.sort(digits);
        int n = digits.length;
        return new int[]{digits[n - 1], digits[n - 2]};
    }

    public static int[] smallestAndSecondSmallest(int[] digits) {
        Arrays.sort(digits);
        return new int[]{digits[0], digits[1]};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = countDigits(num);
        int[] digits = storeDigits(num);

        System.out.println("Number of digits: " + count);
        System.out.print("Digits: ");
        for (int d : digits)
            System.out.print(d + " ");
        System.out.println();

        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(digits));

        int[] largest = largestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = smallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}

package level3;
import java.util.*;

public class Q6 {

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factors[index++] = i;
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors)
            sum += f;
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors)
            product *= f;
        return product;
    }

    public static long productOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors)
            product *= Math.pow(f, 3);
        return product;
    }

    public static boolean isPerfect(int num, int[] factors) {
        int sumProper = sumOfFactors(factors) - num;
        return sumProper == num;
    }

    public static boolean isAbundant(int num, int[] factors) {
        int sumProper = sumOfFactors(factors) - num;
        return sumProper > num;
    }

    public static boolean isDeficient(int num, int[] factors) {
        int sumProper = sumOfFactors(factors) - num;
        return sumProper < num;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static boolean isStrongNumber(int num) {
        int[] digits = storeDigits(num);
        int sum = 0;
        for (int d : digits)
            sum += factorial(d);
        return sum == num;
    }

    public static int[] storeDigits(int num) {
        int n = String.valueOf(num).length();
        int[] digits = new int[n];
        int temp = num;
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors: ");
        for (int f : factors)
            System.out.print(f + " ");
        System.out.println();

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));

        System.out.println("Is Perfect Number: " + isPerfect(num, factors));
        System.out.println("Is Abundant Number: " + isAbundant(num, factors));
        System.out.println("Is Deficient Number: " + isDeficient(num, factors));
        System.out.println("Is Strong Number: " + isStrongNumber(num));
    }
}

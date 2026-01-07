package level2;

import java.util.Scanner;

public class Q1 {

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    public static int sumOfFactors(int[] arr) {
        int sum = 0;
        for (int x : arr)
            sum += x;
        return sum;
    }

    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int x : arr)
            sum += x * x;
        return sum;
    }

    public static long productOfFactors(int[] arr) {
        long product = 1;
        for (int x : arr)
            product *= x;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        for (int f : factors)
            System.out.print(f + " ");

        System.out.println();
        System.out.println(sumOfFactors(factors));
        System.out.println(sumOfSquares(factors));
        System.out.println(productOfFactors(factors));
    }
}

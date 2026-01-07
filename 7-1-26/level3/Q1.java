package level3;

import java.util.Scanner;

public class Q1 {

    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int h : heights)
            sum += h;
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return (double) sumOfHeights(heights) / heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int h : heights)
            if (h < min)
                min = h;
        return min;
    }

    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int h : heights)
            if (h > max)
                max = h;
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextInt();
        }

        System.out.println("Shortest Height: " + shortestHeight(heights));
        System.out.println("Tallest Height: " + tallestHeight(heights));
        System.out.println("Mean Height: " + meanHeight(heights));
    }
}

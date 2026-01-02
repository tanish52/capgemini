package level3;
import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;

        while (n != 0) {
            n /= 10;
            count++;
        }

        System.out.println("Digits = " + count);
    }
}

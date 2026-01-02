package level1;
import java.util.Scanner;

class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        while (true) {
            double n = sc.nextDouble();
            if (n <= 0) break;
            total += n;
        }
        System.out.println(total);
    }
}

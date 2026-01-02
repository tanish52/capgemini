package level1;
import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, i = 1;
        while (i <= n) sum += i++;
        System.out.println(sum == n*(n+1)/2);
    }
}

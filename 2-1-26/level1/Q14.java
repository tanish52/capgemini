package level1;
import java.util.Scanner;

class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;
        while (n > 0) {
          fact *= n;
        n--;
      }
        System.out.println(fact);
    }
}

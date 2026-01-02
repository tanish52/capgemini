package level1;
import java.util.Scanner;

class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        System.out.println(years > 5 ? salary * 0.05 : 0);
    }
}

package level2;
import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageA = sc.nextInt();
        int ageB = sc.nextInt();
        int ageC = sc.nextInt();

        int heightA = sc.nextInt();
        int heightB = sc.nextInt();
        int heightC = sc.nextInt();

        if (ageA <= ageB && ageA <= ageC)
            System.out.println("Amar is youngest");
        else if (ageB <= ageA && ageB <= ageC)
            System.out.println("Akbar is youngest");
        else
            System.out.println("Anthony is youngest");

        if (heightA >= heightB && heightA >= heightC)
            System.out.println("Amar is tallest");
        else if (heightB >= heightA && heightB >= heightC)
            System.out.println("Akbar is tallest");
        else
            System.out.println("Anthony is tallest");
    }
}

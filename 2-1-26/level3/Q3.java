package level3;
import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(), c = sc.nextInt(), m = sc.nextInt();

        double avg = (p + c + m) / 3.0;
        System.out.println("Average = " + avg);

        if (avg >= 80) System.out.println("Grade A");
        else if (avg >= 70 && avg<=79) System.out.println("Grade B");
        else if (avg >= 60 && avg<=69) System.out.println("Grade C");
        else if (avg >= 50 && avg<=59) System.out.println("Grade D");
         else if (avg >= 40 && avg<=49) System.out.println("Grade E");
        else System.out.println("Grade R");
    }
}

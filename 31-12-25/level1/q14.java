import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        float distanceInFeet = sc.nextFloat();

        float yards = distanceInFeet / 3;
        float miles = yards / 1760;

        System.out.println("Distance in yards is " + yards +
                " and in miles is " + miles);
    }
}

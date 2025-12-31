package level2;
import java.util.*;
public class q9 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1: ");
        float side1 = sc.nextFloat();

        System.out.print("Enter side2: ");
        float side2 = sc.nextFloat();

        System.out.print("Enter side3: ");
        float side3 = sc.nextFloat();

        float perimeter = side1 + side2 + side3;
        float rounds = 5000 / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds);
  }
}

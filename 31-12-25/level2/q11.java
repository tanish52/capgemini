package level2;
import java.util.*;
public class q11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        float principal = sc.nextFloat();

        System.out.print("Enter rate: ");
        float rate = sc.nextFloat();

        System.out.print("Enter time: ");
        float time = sc.nextFloat();

        float simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
  }
}

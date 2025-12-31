package level2;
import java.util.*;
public class q12 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        float weight = sc.nextFloat();

        float weightInKg = weight / 2.2f;

        System.out.println("The weight of the person in pound is " +
                weight + " and in kg is " + weightInKg);
  }
}

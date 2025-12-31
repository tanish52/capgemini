package level2;
import java.util.*;
public class q4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in celsius: ");
        float celsius = sc.nextFloat();

        float fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius +
                " celsius is " + fahrenheitResult + " fahrenheit");
  }
}

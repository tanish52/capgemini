package level2;
import java.util.*;
public class q5 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in fahrenheit: ");
        float fahrenheit = sc.nextFloat();

        float celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit +
                " fahrenheit is " + celsiusResult + " celsius");
  }
}

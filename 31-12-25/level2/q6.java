package level2;
import java.util.*;
public class q6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        float salary = sc.nextFloat();

        System.out.print("Enter bonus: ");
        float bonus = sc.nextFloat();

        float totalIncome = salary + bonus;

        System.out.println("The salary is INR " + salary +
                " and bonus is INR " + bonus +" Hence Total Income is INR " + totalIncome);
  }
}

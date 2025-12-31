package level2;
import java.util.*;
public class q8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter from city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter to city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter distance from source to via (miles): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance from via to destination (miles): ");
        double viaToFinalCity = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;

        System.out.println(name + " travels from " + fromCity +
                " to " + toCity + " via " + viaCity +
                " covering a total distance of " + totalDistance + " miles");
  }
}

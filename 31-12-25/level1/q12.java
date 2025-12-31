import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
        float base = sc.nextFloat();

        System.out.print("Enter height in inches: ");
        float height = sc.nextFloat();

        float areaInSquareInches = 0.5f * base * height;
        float areaInSquareCm = areaInSquareInches * 6.4516f;

        System.out.println("Area of triangle is " + areaInSquareInches +" square inches and " + areaInSquareCm + " square centimeters");
    }
}


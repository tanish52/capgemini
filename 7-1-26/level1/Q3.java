import java.util.*;
public class Q3 {
  public static double totalround(double a,double b,double c){
    return 5000/(a+b+c);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double side1=sc.nextDouble();
    double side2=sc.nextDouble();
    double side3=sc.nextDouble();
    double rounds=totalround(side1,side2,side3);
    System.out.println(rounds);
  }
}

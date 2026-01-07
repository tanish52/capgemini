import java.util.*;
public class Q1{
  public static double sinterest(double p,double r ,int t){
    return ((p*r*t)/100);
  }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      double principle=sc.nextDouble();
      double rate=sc.nextDouble();
      int time=sc.nextInt();
      double si=sinterest(principle,rate,time);
      System.out.println(si);
  }
}
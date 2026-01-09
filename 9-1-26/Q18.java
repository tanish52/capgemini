 import java.util.*;
public class Q18{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int decimal=Integer.parseInt(s,2);
    String Binary=Integer.toBinaryString(decimal);
    System.out.println("Decimal is " +decimal+ " Binary is "+ Binary);
  }}
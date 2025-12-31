import java.util.*;
public class q10 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double heightInCm=sc.nextDouble();
    int heightInInch=(int)(heightInCm/2.54);

    int foot=heightInInch/12;
    int inch=heightInInch%12;
    System.out.println("Your Height in cm is"+heightInCm+" while in feet is "+foot+" and inches is "+inch);
  }
}

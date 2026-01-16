import java.util.*;
class Circle{
  double radius=35;
  Circle(double r){
  radius=r;
  }
  
}
public class Q2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Circle c1=new Circle(35);
    System.out.println("The radius of the circle is "+c1.radius);
  }
}

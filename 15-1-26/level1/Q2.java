  import java.util.*;
  class Circle{
    double radius;
    void circumferene(){
      System.out.println("Circumference of circle is "+ 2*3.14*radius);
    }
    void area(){
      System.out.println("Area of circle is "+ 3.14*radius*radius );
    }
  }
public class Q2 {

  public static void main(String[] args) {
    Circle c1=new Circle();
    c1.radius=25.0;
    c1.circumferene();
    c1.area();
  }
}

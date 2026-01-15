import java.util.*;
class MobilePhone{
  String brand;
  String model;
  int price;
  void display(){
    System.out.println("The Brand is "+ this.brand);
    System.out.println("The Model is "+ this.model);
    System.out.println("The Price of the mobile is "+ this.price);
  }
  MobilePhone(String brand,String Model,int price){
    this.brand=brand;
    this.model=Model;
    this.price=price;
  }
}
public class Q5 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String Brand=sc.nextLine();
    String Model=sc.nextLine();
    int price=sc.nextInt();
    MobilePhone m1=new MobilePhone(Brand, Model, price);
    m1.display();
  }
}

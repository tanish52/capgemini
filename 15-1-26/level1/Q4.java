import java.util.*;
class Item{
  int itemcode;
  String itemname;
  int price;
  
  void display(int quantity){
    System.out.println("Item code is "+this.itemcode);
    System.out.println("Item name is "+this.itemname);
    System.out.println("Item price is "+this.price);
    System.out.println("Total price is "+ quantity*this.price);
  }
}
public class Q4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Item i1 =new Item();
    i1.itemcode=1234;
    i1.itemname="chair";
    i1.price=500;
    i1.display(n);
  }
}

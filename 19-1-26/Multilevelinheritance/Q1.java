package Multilevelinheritance;

class Order{
  int orderId;
  String OrderDate;
  Order(int oid,String od){
    this.orderId=oid;
    this.OrderDate=od;
  }

  void getorderStatus(){
    System.out.println("Order is placed");
  }
}
class Shippedorder extends Order{
  int trackingNumber;
  Shippedorder(int oid,String od,int tn){
    super(oid, od);
    this.trackingNumber=tn;
  }
  void getorderStatus(){
    System.out.println("Order is Shipped");
  }
}
class Deliveredorder extends Shippedorder{
  String deliveryDate;
  Deliveredorder(int oid,String od,int tn,String dd){
    super(oid, od, tn);
    this.deliveryDate=dd;
  }
  void getorderStatus(){
    System.out.println("Order is Delivered");
  }
}
public class Q1 {
  public static void main(String[] args) {
      Order o1 = new Order(101, "12-01-2026");
        o1.getorderStatus();

        Order o2 = new Shippedorder(102, "13-01-2026", 45678);
        o2.getorderStatus();

        Order o3 = new Deliveredorder(103, "14-01-2026", 98765, "18-01-2026");
        o3.getorderStatus();
  }
}

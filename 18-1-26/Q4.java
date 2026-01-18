class Product{
  static int discount=10;
  static void updatediscount(int n){
      discount=n;
  }
  String productName;
  int price;
  int quantity;
  final int productid;
  Product(String p,int pr,int q,int pid){
    this.productName=p;
    this.price=pr;
    this.quantity=q;
    this.productid=pid;
  }
  void details(){
    System.out.println("The name of the Product is "+this.productName);
    System.out.println("The id of the product is "+this.productid);
    System.out.println("The price of the product is "+this.price);
    System.out.println("The quantity of the Product is "+this.quantity);
    
  }

}
public class Q4 {
  public static void main(String[] args) {
    Product p1=new Product("Laptop", 2000, 2, 32434);
    if(p1 instanceof Product){
      p1.details();
    }
     System.out.println(Product.discount);
    Product.updatediscount(25);
    System.out.println(Product.discount);
  }
}

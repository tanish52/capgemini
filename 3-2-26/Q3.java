import java.util.*;

abstract class category{

  abstract void show();
}

class BookCategory extends category{
  
  void show(){
    System.out.println("Book Category");
    }
  }

  class GadgetsCategory extends category{
 
  void show(){
    System.out.println("Gadgets Category");
    }
  }

  class ClothingCategory extends category{

  void show(){
    System.out.println("Clothing Category");
    }
  }
class Product<T extends category>{
  double price;
  int range;
  T categor;
  Product(int p,int r,T cat){
    price=p;
    range=r;
    categor=cat;
  }

  void display(){
    System.out.println("Price is "+ price +"Range is "+range+"category is ");
    categor.show();
  }
   
   }
   class Discountutil{
    static void discount(Product <?> p,double di){  
      p.price=p.price-(p.price *di/100);

    }
  
}
public class Q3 {
  public static void main(String[] args) {
    Product<BookCategory> b1=new Product<>(100, 120, new BookCategory());
    b1.display();
    Discountutil.discount(b1, 10);
    b1.display();
  }
}

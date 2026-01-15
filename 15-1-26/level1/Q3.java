import java.util.*;
class Book{
  String title;
  String author;
  int price;
  void dispaly(){
    System.out.println("Book title is "+ this.title);
    System.out.println("Book author is "+ this.author);
    System.out.println("Book price is "+ this.price);
  }
}
public class Q3 {
 public static void main(String[] args) {
  Book b1=new Book();
  b1.author="David Goggins";
  b1.title="Never finished";
  b1.price=350;
  b1.dispaly();
 } 
}

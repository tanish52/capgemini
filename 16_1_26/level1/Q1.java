import java.util.*;
class Book{
  String title;
  String author;
  int price;
  Book(String title,String author,int price){
    this.title=title;
    this.author=author;
    this.price=price;
  }
}
public class Q1{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String s1=sc.nextLine();
    int price=sc.nextInt();
      Book b1=new Book(s1,str,price);
      System.out.println("The author of the Book is "+b1.author);
    System.out.println("The title of the Book is "+b1.title);
    System.out.println("The price of the Book is "+b1.price);
  }
}
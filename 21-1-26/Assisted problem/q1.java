import java.util.*;

class Library{
  String libraryName;
  ArrayList<Book> books;
  Library(String liname){
    this.libraryName=liname;
    books=new ArrayList<>();
  }

  void addbook(Book b){
    books.add(b);
  }
  void showbooks(){
    System.out.println("Books in library "+ libraryName+" are");
    for(Book a:books){
        a.display();
    }
  }

}

  class Book{
  String title;
  String author;

  Book(String t,String a){
    this.title=t;
    this.author=a;
  }

  void display(){
    System.out.println("The Title is "+title);
    System.out.println("The  is "+author);
  }
  
}

public class q1{
  public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Clean Code", "Robert Martin");
        Book b3 = new Book("Effective Java", "Joshua Bloch");

 
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        
        lib1.addbook(b1);
        lib1.addbook(b2);

        lib2.addbook(b2);
        lib2.addbook(b3);

       
        lib1.showbooks();
        lib2.showbooks();
  }
}
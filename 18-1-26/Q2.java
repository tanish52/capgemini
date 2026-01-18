class Book{
  static String libraryName="library1";
  static void displayLibraryName(){
    System.out.println(libraryName);
  }
  String title;
  String author;
  final int isbn;
  Book(String t,String auth,int i){
    this.title=t;
    this.author=auth;
    this.isbn=i;
  }

  void displaydetail(){
    System.out.println(this.title);
    System.out.println(this.author);
    System.out.println(this.isbn);
    
  }
}
public class Q2 {
  public static void main(String[] args) {
    Book b1=new Book("Never finished","Dvid Goggins" , 1);
    if(b1 instanceof Book){
      b1.displaydetail();
    }
    Book.displayLibraryName();
  } 
}

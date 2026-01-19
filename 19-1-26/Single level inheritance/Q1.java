class Book{
  String title;
  int publishyear;
}
class Author extends Book{
  String name;
    String bio;

    void displaydetail(){
      System.out.println("The author of the Book is "+this.name);
      System.out.println("The title of the Book is "+this.title);
      System.out.println("The publishyear of the Book is "+ publishyear);
    }

    Author(String t,String a,int p){
      this.title=t;
      this.name=a;
      this.publishyear=p;
    }

}
public class Q1{
    public static void main(String[] args) {
    Author a1=new Author("Cant hurt me", "David Goggins",2008);
    a1.displaydetail();
  }
}
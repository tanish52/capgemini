import java.util.Scanner;
class Person{
  String name;
  int age;
  Person(String n,int a){
    name=n;
    age=a;

  }
  Person(Person a){
    this.name=a.name;
    this.age=a.age;
  }
}
public class Q3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Person p1=new Person("Taran", 22);
    Person p2=new Person(p1);
    System.out.println(" The name of P2 is "+ p2.name);
    System.out.println("The age of P2 is "+ p2.age);
  }
}

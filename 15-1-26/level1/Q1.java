import java.util.*;
class Employee{
  String name;
  int id;
  int salary;
  void dispaly(){
    System.out.println("Employee name is "+ this.name);
    System.out.println("Employee id is "+ this.id);
    System.out.println("Employee salary is "+this.salary);
  }
}
public class Q1{
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);  
    Employee e1=new Employee();
    e1.name="Tanish";
    e1.id=1234;
    e1.salary=28000;
    e1.dispaly();
  }
}
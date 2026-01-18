
class Employees{
  static String companyName="Capgemini";
  static int employeeCount;
  static void employeenumber(){
    System.out.println("Number of Employee is "+employeeCount);
  }
  String name;
  final int id;
  String designation;
  Employees(String n,int i,String d){
    this.name=n;
    this.id=i;
    this.designation=d;
    employeeCount++;
  }
  void details(){
    System.out.println("The name of the employee is "+this.name);
    System.out.println("The id of the employee is "+this.id);
    System.out.println("The Designation of the employee is "+this.designation);
    
  }
  

}
public class Q3 {
      public static void main(String[] args) {
    Employees e1=new Employees("Tanish", 3, "Senior Analyst");
    if(e1 instanceof Employees){
      e1.details();
    }
    e1.employeenumber();
  } 
}

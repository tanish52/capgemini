import java.util.*;
import java.io.*;
class Employee{
  String name;
  String department;
  int salary;
  Employee(String n,String d,int s){
    name=n;
    department=d;
    salary=s;
  }
  void display(){
    System.out.println(name+"-->"+department+"-->"+salary);
  }

}
public class Q7 {
  public static void main(String[] args) {
    List<Employee> li=new ArrayList<>();
    try(BufferedReader br=new BufferedReader(new FileReader("Q6output.csv"))){
      String line;
      br.readLine();
      while((line=br.readLine())!=null){
        String [] colums=line.split(",");
        String name=colums[0].trim();
        String department=colums[1].trim();
        int salary=Integer.parseInt(colums[2]);
        li.add(new Employee(name,department,salary));
      }
      li.sort((a,b)->b.salary-a.salary);
     for(int i=0;i<Math.min(5,li.size());i++){
      li.get(i).display();
     }

    }
    catch(IOException i){
      System.out.println("Exception handled");
    }
  }
}

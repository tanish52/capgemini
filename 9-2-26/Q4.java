import java.util.*;
import java.io.*;
class Employee implements Serializable{
  String name;
  int id;
  int salary;
  Employee(int i,String n,int s){
    id=i;
    name=n;
    salary=s;
  }
    void display() {
        System.out.println(id + " | " + name +  " | " + salary);
    }

}
public class Q4 {
  public static void main(String[] args) {
    List<Employee> li=new ArrayList<>();
    li.add(new Employee(2438,"Tanish" , 1000000));
    li.add(new Employee(2454,"Taran" , 1000000));

    //Serilization
    try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Q4output.ser"))){
      oos.writeObject(li);
       System.out.println("Employees saved successfully.");
    }
    catch(IOException i){
      System.out.println("Exception Handled");
    }


    //Deserialization

    try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Q4output.ser"))){
      List<Employee> lis=(List<Employee>) ois.readObject();
      for(Employee e:lis){
        e.display();
      }
    }
    catch(IOException | ClassNotFoundException i){
      System.out.println("Exception handled sucessfully");
    }
  }
}

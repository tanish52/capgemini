import java.util.*;
import java.io.*;
class Student {
    int id;
    String name;
    int age;
    int marks;

    Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.printf("%d | %s | %d | %d%n", id, name, age, marks);
    }
}
public class Q8 {

  public static void main(String[] args) {
    List<Student> li=new ArrayList<>();
    try(BufferedReader br=new BufferedReader(new FileReader("Q8input.csv"))){
      String line;
      br.readLine();
      while((line=br.readLine())!=null){
        String [] colums=line.split(",");
        int id=Integer.parseInt(colums[0].trim());
        String name=colums[1].trim();
         int age=Integer.parseInt(colums[2].trim());
          int marks=Integer.parseInt(colums[3].trim());
          li.add(new Student(id,name,age,marks));
      }
      for(Student s:li){
        s.display();
      }

    }
    catch(IOException i){
      System.out.println("Exception handled carefully");
    }
  }
}

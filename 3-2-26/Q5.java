import java.util.*;
abstract class JobRole{
  abstract void showrole();
}
class softwareengineer extends JobRole{
  void showrole(){
    System.out.println("Software Engineer");
  }
}

class DataAnalyst extends JobRole{
  void showrole(){
    System.out.println("Data Analyst");
  }
}


class Resume<T extends JobRole>{
  T role;
  Resume(T role){
    this.role=role;
  }
  void display(){
    role.showrole();
  }
}

class Resumescreening{
  static <T extends JobRole> void screen(Resume <T> r){
    r.display();
  } 

  static <T extends JobRole> void result(List<? extends JobRole> li){
    for(JobRole jr:li){
      jr.showrole();
    }
  }
}
public class Q5 {
  public static void main(String[] args) {
    Resume<softwareengineer> r1=new Resume<>(new softwareengineer());
     Resumescreening.screen(r1);
    Resume<DataAnalyst> r2=new Resume<>(new DataAnalyst());
    Resumescreening.screen(r2);
    List<JobRole> li=new ArrayList<>();   
    li.add(new softwareengineer());
    li.add(new DataAnalyst());
    Resumescreening.result(li);
  }
}

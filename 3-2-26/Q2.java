import java.util.*;

abstract class courseType {
  abstract void evaluate();
  
}
class Examcourse extends courseType{
  void evaluate(){
    System.out.println("Exam Course");
  }
}

class assignmentcourse extends courseType{
  void evaluate(){
    System.out.println("Assignment Course");
  }
}

class Researchcourse extends courseType{
  void evaluate(){
    System.out.println("Research Course");
  }
}

  class  courses<T extends courseType>{
    List<T> l1=new ArrayList<>();

    void add(T course){
      l1.add(course);
    }

    List <T> get(){
      return l1;
    }
}

class printdetail{
  static void display(List<? extends courseType> li){
    for(courseType a:li){
      a.evaluate();
    }
  }
}
public class Q2 {
  public static void main(String[] args) {
    courses <assignmentcourse> a=new courses<>();
    a.add(new assignmentcourse());
    courses <Examcourse> e=new courses<>();
    e.add(new Examcourse());
    courses <Researchcourse> r=new courses<>();
    r.add(new Researchcourse());
    printdetail.display(a.get());
    printdetail.display(e.get());
    printdetail.display(r.get());
  }
}

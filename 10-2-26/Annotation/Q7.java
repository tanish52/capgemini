import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.util.*;
import java.lang.reflect.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface todo{
  String task();
  String assignedTo();
  String priority()default("Medium");
}

class work{
  @todo(task="nothing", assignedTo="Tanish")
  void run(){
    System.out.println("Work running");
  }
}
public class Q7 {
  public static void main(String[] args) throws Exception{
    work w1=new work();
    Method method=w1.getClass().getDeclaredMethod("run");
    if(method.isAnnotationPresent(todo.class)){
      todo td=method.getAnnotation(todo.class);
      System.out.println(td.assignedTo());
      System.out.println(td.priority());
      System.out.println(td.task());
    }
  }
}

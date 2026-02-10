import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Taskinfo{
  int priority();
  String assignedTo();
}

class TaskManager{
  @Taskinfo(priority = 1,assignedTo = "Tanish")
  void completeTask(){
    System.out.println("Task Completed");
  }
}
public class Q4 {
  public static void main(String[] args) throws Exception {
    Method method=TaskManager.class.getDeclaredMethod("completeTask");
    if(method.isAnnotationPresent(Taskinfo.class)){
      Taskinfo task=method.getAnnotation(Taskinfo.class);
      System.out.println(task.priority());
      System.out.println(task.assignedTo());
    }
  }
}

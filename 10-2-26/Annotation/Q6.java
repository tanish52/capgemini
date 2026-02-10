import java.lang.reflect.*;
import java.lang.annotation.*;
import java.util.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod{
  String level() default"High";
}

class Work{
  @ImportantMethod(level = "low")
  void run(){
    System.out.println("Less important");
  }

  @ImportantMethod(level = "High")
  void run2(){
    System.out.println("High importance");
  }

}

public class Q6 {
  public static void main(String[] args) throws Exception{
    Work w1=new Work();
    Method [] methods=w1.getClass().getDeclaredMethods();
    for(Method i:methods){
    ImportantMethod i1=i.getAnnotation(ImportantMethod.class);
     System.out.println(i1.level());
   }
  }
}

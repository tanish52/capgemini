import java.util.*;
import java.lang.reflect.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Bugreports{
  bugreport[] value();
}
@Repeatable(Bugreports.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface bugreport{
  String Description();
}

class Software{

  @bugreport(Description ="Memory Leak")
  @bugreport(Description ="NULL pointer ")
  void run(){
    System.out.println("Running software");
  }
}
public class Q5 {
  public static void main(String[] args) throws Exception{
    Method method=Software.class.getDeclaredMethod("run");
    
      bugreport []br=method.getAnnotationsByType(bugreport.class);
    for(bugreport b:br){
      System.out.println(b.Description());
    }
    
  }
}

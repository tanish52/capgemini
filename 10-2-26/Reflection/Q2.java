import java.util.*;
import java.lang.reflect.*;
import java.lang.annotation.*;
class Person{
  private int age=20;

}
public class Q2 {
  public static void main(String[] args) throws Exception{
    Person p=new Person();
    Field f=p.getClass().getDeclaredField("age");
    f.setAccessible(true);
    f.set(p,25);
    System.out.println(f.get(p));
  }
}

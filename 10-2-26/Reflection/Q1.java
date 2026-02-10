import java.util.*;
import java.lang.reflect.*;
import java.lang.annotation.*;
class Mani{
  String name="Tanish";
}
public class Q1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    try{
    Class c=Class.forName(name);

    for(Constructor con:c.getDeclaredConstructors()){
      System.out.println(con);
    }

    for(Field f:c.getDeclaredFields()){
      System.out.println(f);
    }

    }
  catch(ClassNotFoundException i){
    System.out.println("handled exception");
  }
  }
}

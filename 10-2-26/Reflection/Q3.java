import java.util.*;
import java.lang.reflect.*;
import java.lang.annotation.*;
class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}
public class Q3 {
  public static void main(String[] args) throws Exception{
    Calculator c=new Calculator();
    Method m=c.getClass().getDeclaredMethod("multiply", int.class,int.class);
    m.setAccessible(true);
    int result=(int)m.invoke(c, 4,5);
    System.out.println(result);
  }
}

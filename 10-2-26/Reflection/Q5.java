import java.util.*;
import java.lang.annotation.*;
import java.lang.reflect.*;
class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class Q5 {
  public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter method name (add / subtract / multiply): ");
        String methodName = sc.next();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Class cls = Class.forName("MathOperations");
        Object obj = cls.newInstance();

        Method method = cls.getMethod(methodName, int.class, int.class);
        Object result = method.invoke(obj, a, b);

        System.out.println("Result: " + result);
  }
}

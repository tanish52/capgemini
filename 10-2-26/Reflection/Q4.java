import java.util.*;
import java.lang.annotation.*;
import java.lang.reflect.*;
class Student {
    Student() {
        System.out.println("Student object created");
    }
}

public class Q4 {
  public static void main(String[] args)  throws Exception{
    Class c=Class.forName("Student");
    Student s=(Student) c.newInstance();
  }
}

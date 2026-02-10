import java.lang.annotation.*;
import java.util.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name="Tanish")
class Book {
}

public class Q6  {
    public static void main(String[] args) throws Exception {
        Class b = Class.forName("Book");
        Author a = (Author) b.getAnnotation(Author.class);
        System.out.println("Author: " + a.name());
    }
}

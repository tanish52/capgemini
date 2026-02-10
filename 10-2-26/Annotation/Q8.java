import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {

    @MaxLength(10)
    private String username;

    User(String username) {
        try {
            Field field = this.getClass().getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {

                MaxLength max = field.getAnnotation(MaxLength.class);

                if (username.length() > max.value()) {
                    throw new IllegalArgumentException(
                        "Username length exceeds max limit of " + max.value()
                    );
                }
            }
            this.username = username;

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    void display() {
        System.out.println("Username: " + username);
    }
}

public class Q8 {
    public static void main(String[] args) throws Exception {

        User u1 = new User("Tanish");       
        u1.display();

        User u2 = new User("VeryLongUsername"); 
        u2.display();
    }
}

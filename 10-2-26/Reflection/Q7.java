import java.lang.reflect.*;
import java.util.*;
class Configuration {
    private static String API_KEY = "OLD_KEY";
}

public class Q7 {
    public static void main(String[] args) throws Exception {
        Configuration c = new Configuration();
        Field f = c.getClass().getDeclaredField("API_KEY");
        f.setAccessible(true);
        f.set(null, "NEW_KEY");
        System.out.println("API_KEY: " + f.get(null));
    }
}

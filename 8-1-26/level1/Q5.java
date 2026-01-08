import java.util.*;

public class Q5 {

    public static void generateException(String s) {
        System.out.println(s.charAt(s.length()));
    }

    public static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        try {
            generateException(str);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred while generating");
        }

        handleException(str);

     
    }
}

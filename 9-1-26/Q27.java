import java.util.*;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch + "  " + (int) ch);
        }
    }
}

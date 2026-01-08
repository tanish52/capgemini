import java.util.*;
public class Q6{

    public static String toLowerUsingCharAt(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result = result + ch;
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String userLower = toLowerUsingCharAt(str);

        String builtInLower = str.toLowerCase();

        boolean result = compareStrings(userLower, builtInLower);

        System.out.println("Lowercase using charAt(): " + userLower);
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);

        if (result) {
            System.out.println("Both lowercase strings are equal");
        } else {
            System.out.println("Both lowercase strings are different");
        }
        
    }
}

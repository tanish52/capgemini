
package level2;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int len = findLength(s);

        String[] res = customSplit(s, len);

        String temp[][] = twoDimensional(res);

        for(int i = 0; i < temp.length; i++){
            System.out.println(temp[i][0] + " and the length is " + temp[i][1]);
        }

    }

    public static int findLength(String var0) {
        int var1 = 0;

        while (true) {
            try {
                var0.charAt(var1);
            } catch (RuntimeException var3) {
                return var1;
            }

            ++var1;
        }
    }

    public static String[] customSplit(String s, int len) {

        int words = 0;

        if (s.charAt(0) != ' ') {
            words++;
        }

        for (int i = 1; i < len; i++) {

            if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
                words++;
            }
        }

        String arr[] = new String[words];

        int index = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                if (sb.length() > 0) {
                    arr[index] = sb.toString();
                    index++;
                    sb = new StringBuilder("");
                }
            } else {
                sb.append(s.charAt(i));
            }
        }

        if (sb.length() > 0) {
            arr[index] = sb.toString();
        }

        return arr;

    }

    public static String[][] twoDimensional(String[] arr) {

        String res[][] = new String[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i][0] = arr[i];
            res[i][1] = String.valueOf(findLength(arr[i]));
        }

        return res;

    }
}
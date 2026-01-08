package level3;

import java.util.*;

public class Q2 {

    static char firstNonRepeatingChar(String text) {
        int[] freq = new int[256];

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                freq[ch]++;
            } catch (Exception e) {
                break;
            }
        }

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (freq[ch] == 1) {
                    return ch;
                }
            } catch (Exception e) {
                break;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char result = firstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println(result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}

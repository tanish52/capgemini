package level3;

import java.util.*;

public class Q5 {

    static int stringLength(String text) {
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (Exception e) {
        }
        return len;
    }

    static boolean areAnagrams(String text1, String text2) {
        int len1 = stringLength(text1);
        int len2 = stringLength(text2);

        if (len1 != len2) return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < len1; i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text1 = sc.nextLine();
        String text2 = sc.nextLine();

        boolean result = areAnagrams(text1, text2);

        if (result) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
}

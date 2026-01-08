package level3;

import java.util.*;

public class Q4 {

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

    static char[] uniqueCharacters(String text) {
        int length = stringLength(text);
        char[] temp = new char[length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count++] = current;
            }
        }

        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    static String[][] frequencyUsingUnique(String text) {
        int[] freq = new int[256];

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                freq[ch]++;
            } catch (Exception e) {
                break;
            }
        }

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[][] output = frequencyUsingUnique(input);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i][0] + "\t\t" + output[i][1]);
        }
    }
}


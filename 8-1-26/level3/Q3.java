package level3;

import java.util.*;

public class Q3 {

    static String[][] characterFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                freq[ch]++;
            } catch (Exception e) {
                break;
            }
        }

        int uniqueCount = 0;
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (freq[ch] > 0) {
                    uniqueCount++;
                    freq[ch] = -freq[ch];
                }
            } catch (Exception e) {
                break;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] < 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(-freq[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[][] output = characterFrequency(input);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i][0] + "\t\t" + output[i][1]);
        }
    }
}

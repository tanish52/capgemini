package level2;

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

    static String[] customSplit(String text) {
        int length = stringLength(text);
        int wordCount = 0;
        boolean insideWord = false;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !insideWord) {
                wordCount++;
                insideWord = true;
            } else if (text.charAt(i) == ' ') {
                insideWord = false;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String currentWord = "";

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else if (!currentWord.equals("")) {
                words[index++] = currentWord;
                currentWord = "";
            }
        }

        if (!currentWord.equals("")) {
            words[index] = currentWord;
        }

        return words;
    }

    static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = stringLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }
        return result;
    }

    static int[] findShortestAndLongest(String[][] data) {
        int shortest = Integer.parseInt(data[0][1]);
        int longest = Integer.parseInt(data[0][1]);

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < shortest) shortest = len;
            if (len > longest) longest = len;
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] table = wordWithLength(words);
        int[] result = findShortestAndLongest(table);

        System.out.println("Shortest length: " + result[0]);
        System.out.println("Longest length: " + result[1]);
    }
}

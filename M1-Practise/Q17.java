import java.util.Scanner;
import java.util.HashSet;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(FindAutoCount(n));
    }

    public static int FindAutoCount(String n){
        if(n == null || n.length() == 0) return 0;

        int len = n.length();
        int[] counts = new int[10];

        for(int i = 0; i < len; i++){
            counts[n.charAt(i) - '0']++;
        }

        for(int i = 0; i < len; i++){
            int expected = n.charAt(i) - '0';
            int actual = counts[i]; // count of digit i in n
            if(expected != actual) return 0;
        }

        HashSet<Character> distinct = new HashSet<>();
        for(int i = 0; i < len; i++){
            distinct.add(n.charAt(i));
        }

        return distinct.size();
    }
}
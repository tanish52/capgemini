package level2;
import java.util.*;

public class Q3 {
  static class PalindromeChecker{
    String text;

    boolean checkPalindrome(String text){

      int left = 0;
      int right = text.length()-1;

      while(left < right){

        char l = text.charAt(left);
        char r = text.charAt(right);

        if(l != r){
          return false;
        }

        left++;
        right--;
      }

      return true;
    }

    void isPalindrome(String text){
      System.out.println(checkPalindrome(text));
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    PalindromeChecker p1 = new PalindromeChecker();

    p1.text = sc.nextLine();

    p1.isPalindrome(p1.text);
  }
}

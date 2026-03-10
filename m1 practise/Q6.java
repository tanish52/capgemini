import java.util.*;
public class Q6 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String [] words=s.split("\\s+");
    for(String word:words){
      if(isPalindrome(word)){
        System.out.println(word);
      }
    }
  }
  static boolean isPalindrome(String s){
    int left=0;
    int right=s.length()-1;
    while(left<right){
      if(s.charAt(left)!=s.charAt(right))return false;
      left++;
      right--;
    }
    return true;
  }
}

import java.util.*;
public class Q24 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    if(s1.length()!=s2.length()){
      System.out.println("Not Anagram");
      return;
    }

    char[] c1=s1.toCharArray();
    char[] c2=s2.toCharArray();
    Arrays.sort(c1);Arrays.sort(c2);
    if(Arrays.equals(c1, c2)){
      System.out.println("Anagram");
    }
    else{
      System.out.println("Not Anagram");
    }
  }
}

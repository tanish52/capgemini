package linearandbinarysearch;
import java.util.*;

public class Q2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    HashSet<Character> set=new HashSet<>();
    StringBuilder str=new StringBuilder();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(!set.contains(ch)){
        set.add(ch);
        str.append(ch);
      }
      
    }
    System.out.println(str.toString());
  }
}

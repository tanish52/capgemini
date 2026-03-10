import java.util.*;
public class Q7 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Set<Character> st=new HashSet<>();
    String ans="";
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++){
      if(!st.contains(s.charAt(i))){
        ans+=s.charAt(i);
      }
      st.add(s.charAt(i));
    }
    System.out.println(ans);
  }
}

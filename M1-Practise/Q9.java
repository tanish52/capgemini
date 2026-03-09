import java.util.*;
public class Q9 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String ans="";
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='-'){
        ans=s.charAt(i)+ans;
      }
      else{
        ans+=s.charAt(i);
      }
    }
    System.out.println(ans);
  }
}

import java.util.*;
public class Q11 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char c1=sc.next().charAt(0);
    char c2=sc.next().charAt(0);
    String ans="";
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)==c1){
        ans+=c2;
      }
      else if(s.charAt(i)==c2){
        ans+=c1;
      }
      else{
        ans+=s.charAt(i);
      }
    }
    System.out.println(ans);
  }
}

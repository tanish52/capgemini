import java.util.*;
public class Q2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int result=s.charAt(0)-'0';
    for(int i=1;i<s.length();i+=2){
      char curr=s.charAt(i);
      int next=s.charAt(i+1)-'0';
      if(curr=='A'){
        result=result & next;
      }
      else if(curr=='B'){
        result=result | next;

      }
      else if(curr =='C'){
        result=result ^ next;
      }
    }
    System.out.println(result);
  }
}

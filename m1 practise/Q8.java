import java.util.*;
public class Q8 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    String ans="";
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)>='d' && str.charAt(i)<='z'){
      ans+=(char)(str.charAt(i)-3);}
      else{
        if(str.charAt(i)=='a'){
          ans+='x';
        }
        else if(str.charAt(i)=='b'){
          ans+='y';
        }
        else{
          ans+='z';
        }
      }
    }
    System.out.println(ans);
  }
}

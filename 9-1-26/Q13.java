import java.util.*;
public class Q13 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    StringBuilder s=new StringBuilder();
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch!=' '){
        s.append(ch);
      }
      else{
        s.append('-');
      }
    }
    System.out.println(s.toString());
  }
}

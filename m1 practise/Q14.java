import java.util.Scanner;
import java.util.*;
public class Q14 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    char first=s.charAt(0);
    char last=s.charAt(s.length()-1);
    String ans="";
    ans+=first;
    ans+=s.length()-2;
    ans+=last;
    System.out.println(ans);
  }
}

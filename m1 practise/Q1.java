import java.util.*;
public class Q1{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int n=sc.nextInt();
    String temp="";
    while(n>0){
      temp+=s;
      n--;
    }
    System.out.println(temp);
  }
}
package level2;
import java.util.*;
public class Q1 {
  public static int len(String s){
   int count=0;
   while(true){
   try{
      s.charAt(count);
      
   }
  catch(StringIndexOutOfBoundsException e){
    return count;

  }
count++;}
    
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int lengthOfstr=len(str);
    System.out.println(lengthOfstr);
  }
}

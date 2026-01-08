import java.util.*;
public class Q2 {
  public static String usingsubstring(String str,int s,int e){
      String result="";
      for(int i=s;i<e;i++){
        result+=str.charAt(i);
      }
      return result;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int start=sc.nextInt();
    int end=sc.nextInt();
    String subString1=usingsubstring(str,start,end);
    String suString2=str.substring(start,end);

    System.out.println(subString1);
    System.out.println(suString2);
    if(subString1.equals(suString2)){
      System.out.println("Both are same");
    }
    else{
      System.out.println("Both are differnet");
    }
  }
}

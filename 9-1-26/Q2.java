import java.util.*;
public class Q2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String [] str=s.split("\\s+");
    
    String rev="";
    for(String s1:str){
      StringBuilder s2=new StringBuilder();
      s2.append(s1);
      rev+=s2.reverse()+" ";

    }
    System.out.println(rev);
  }
}

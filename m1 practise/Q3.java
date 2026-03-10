import java.util.*;
public class Q3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String result="";
    int count=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)!='0'){
        count++;
      }
      else{
        result+=(char)('A'+count-1);
        count=0;
      }
    }
    if(count!=0){
       result+=(char)('A'+count-1);
    }
    System.out.println(result);
  }
}

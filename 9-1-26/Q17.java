import java.util.*;
public class Q17 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String r="";
    s=s.toLowerCase();
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)!='a'&& s.charAt(i)!='e'&& s.charAt(i)!='i'&& s.charAt(i)!='o'&& s.charAt(i)!='u'){
        r+=s.charAt(i);
      }
      else{
        continue;
      }
    
    }
    System.out.println(r);

  }
}

import java.util.*;

public class Q3 {
  public static char[] usingstrotochar(String s){
    char[] result=new char[s.length()];
    for(int i=0;i<s.length();i++){
      result[i]=s.charAt(i);
    }
    return result;
  }
  public static boolean compare(char[]s1,char[]s2){
    if(s1.length!=s2.length)return false;
    for(int i=0;i<s1.length;i++){
      if(s1[i]!=s2[i])return false;
      
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    char[] strtochar1=usingstrotochar(str);
    char[] strtochar2=str.toCharArray();
    boolean aresame=compare(strtochar1, strtochar2);

    if(aresame)System.out.println("Both are Same");
    else System.out.println("Both are Different");

  for(int i=0;i<strtochar1.length;i++){
    System.out.println(strtochar1[i]);
  }
  for(int i=0;i<strtochar2.length;i++){
    System.out.println(strtochar2[i]);
  }
  }
}

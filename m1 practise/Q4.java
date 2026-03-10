import java.util.*;
public class Q4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    HashMap<Character,Integer> mp=new HashMap<>();
    String s=sc.nextLine();
    int max=Integer.MIN_VALUE;
    char ans=s.charAt(0);
    for(int i=0;i<s.length();i++){
      mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0 )+1);
    }
    for(int i=0;i<s.length();i++){
      if(mp.get(s.charAt(i))>max){
        max=mp.get(s.charAt(i));
        ans=s.charAt(i);
      }
    }
    System.out.println(ans);
  }
}

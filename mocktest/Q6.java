import java.util.*;
public class Q6 {
  public static void main(String[] args) {
    String s="babac";
    HashMap<Character,Integer> mp=new HashMap<>();
    for(int i=0;i<s.length();i++){
      mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
    }

    int count1=0;
    boolean isPlanidrome=true;
    for(int i=0;i<s.length();i++){
      if(mp.get(s.charAt(i))%2==1){
        count1++;
      }
    }
    if(count1==1){
      System.out.print("true");
    }
    else{
      System.out.print("false");
    }
  }
}

import java.util.*;
public class Q16 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    s=s.toLowerCase();
    HashMap<Character,Integer> mp=new HashMap<>();
    for(int i=0;i<s.length();i++){
      mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0 )+1);
    }
    for(Map.Entry <Character,Integer> m:mp.entrySet()){
      System.out.println(m.getKey()+" "+ m.getValue());
    }
  }
}

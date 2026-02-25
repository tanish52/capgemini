import java.util.*;
public class Q13 {
  public static void main(String[] args) {
    HashMap<String,Integer> mp=new HashMap<>();
    String [] str={"java","python","c++","java","c","pyhton"};
    for(int i=0;i<str.length;i++){
      if(mp.containsKey(str[i])){
        System.out.print(str[i]);
        return ;
      }
      else{
        mp.put(str[i],mp.getOrDefault(str[i],0)+1);
      }
    }
  }
}

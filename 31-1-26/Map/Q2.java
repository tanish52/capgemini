package Map;
import java.util.*;
public class Q2 {
  


    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        for(Map.Entry<String, Integer> mp:map2.entrySet()){
          map1.put(mp.getKey(),map1.getOrDefault(mp.getKey(),0 )+mp.getValue());
        }
        System.out.println(map1);
    }}

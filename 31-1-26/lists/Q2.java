import java.util.*;
public class Q2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    List<String> li=new ArrayList<>();
    HashMap<String,Integer> mp=new HashMap<>();
    for(int i=0;i<n;i++){
      li.add(sc.nextLine());
    }
    for(int i=0;i<n;i++){
      mp.put(li.get(i),mp.getOrDefault(li.get(i), 0)+1);
    }
    System.out.println(mp);
  }
}

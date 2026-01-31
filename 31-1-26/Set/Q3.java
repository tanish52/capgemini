package Set;
import java.util.*;
public class Q3 {
  public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Set<Integer> s1=new HashSet<>();
    Set<Integer> s2=new TreeSet<>();
    for(int i=0;i<n;i++){
      s1.add(sc.nextInt());
    }
    s2.addAll(s1);
    System.out.println(s2);
  }
}

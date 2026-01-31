package Set;
import java.util.*;
public class Q2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Set<Integer> s1=new HashSet<>();
    Set<Integer> s2=new HashSet<>();
    for(int i=0;i<n;i++){
      s1.add(sc.nextInt());
    }
      int m = sc.nextInt(); 
        for (int i = 0; i < m; i++) {
            s2.add(sc.nextInt());
        }

       s1.addAll(s2);// adds all elemets of s2 to s1
       s2.retainAll(s1);// kepps only elements that are in s1 and s2
       
  }
}

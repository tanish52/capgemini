package Set;
import java.util.*;
public class Q1 {
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
    if(s1.equals(s2)){
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }
  }
}

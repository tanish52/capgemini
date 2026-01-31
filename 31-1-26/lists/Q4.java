import java.util.*;
public class Q4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
  List<Integer> li=new ArrayList<>();
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      li.add(sc.nextInt());
    }
    Set<Integer> mp=new LinkedHashSet();
    for(int num:li){
      mp.add(num);
    }
    System.out.println(mp);
  }
}

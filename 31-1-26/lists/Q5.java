import java.util.*;
public class Q5 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    LinkedList<Integer> ll=new LinkedList<>();
    for(int i=0;i<n;i++){
      ll.add(sc.nextInt());
    }
    int k=sc.nextInt();
  
    for(int i=0;i<=ll.size()-k;i++){
      if(i==ll.size()-k){
        System.out.print(ll.get(i));
      }
    }
  }
}

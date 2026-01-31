package Queue;
import java.util.*;
public class Q1 {
  static void reverse(Queue<Integer> q){
    if(q.isEmpty())return;
    int top=q.remove();
    reverse(q);
    q.add(top);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Queue<Integer> q1=new LinkedList<>();
   
    for(int i=0;i<n;i++){
      q1.add(sc.nextInt());
    }
    System.out.println(q1);
   
    reverse(q1);
    System.out.println(q1);
  }
}

import java.util.*;
public class Q1{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    List<Integer> li=new ArrayList<>();
    LinkedList<Integer> ll=new LinkedList<>();

    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      li.add(sc.nextInt());
    }
    for(int i=0;i<n;i++){
      ll.add(sc.nextInt());
    }
    LinkedList<Integer> reversed = new LinkedList<>();
     for (int i = ll.size() - 1; i >= 0; i--) {
            reversed.add(ll.get(i));
        }
    int left=0;
    int right=li.size()-1;
    while(left<right){
      int temp=li.get(left);
      li.set(left,li.get(right));
      li.set(right,temp);
      left++;
      right--;
    }

    System.out.println(reversed);
    System.out.println(li);
  }
}
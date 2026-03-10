import java.util.*;
public class Q15 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]={1,-2,3,-4,5,6};
    List<Integer> li=new ArrayList<>();
    for(int i:arr){
      if(i>=0){
      li.add(i);}
    }
    System.out.println(li.get((li.size()-1)/2));
  }
}

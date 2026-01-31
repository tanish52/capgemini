import java.util.*;
public class Q3 {
  static void reverse(List<Integer> li,int si,int ei){
    while(si<ei){
      int temp=li.get(si);
      li.set(si,li.get(ei));
      li.set(ei,temp);
      si++;
      ei--;
    }
  }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  List<Integer> li=new ArrayList<>();
    int n=sc.nextInt();

    int k=sc.nextInt();
    for(int i=0;i<n;i++){
      li.add(sc.nextInt());
    }
    k=k%n;
   
    reverse(li,0,k-1);
    reverse(li, k, li.size()-1);
     Collections.reverse(li);
    System.out.println(li);

 } 
}

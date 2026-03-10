import java.util.Scanner;
import java.util.*;
public class Q11 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    List<Integer> li=new ArrayList<>();
    while(n>0){
      li.add(n%10);
      n/=10;
    }
    Collections.sort(li);
    int idx=li.get(0);
    for(int i=0;i<li.size()-1;i++){
      if(idx+1<li.get(i+1)){
        System.out.println(idx+1);
        return;
      }
      idx++;
    }
  }
}

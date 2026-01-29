package linearandbinarysearch;
import java.util.*;
public class Q4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();

    }

    for(int i=0;i<n;i++){
      if(arr[i]<0){
        System.out.println("Found negative number at index "+i);
        return;
      }
    }
    System.out.println("Not found "+ (-1));
  }
}

import java.util.*;
public class Q2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
      int curr=arr[i];
      int next=arr[i+1];
      if(next<curr){
        System.out.println(curr);
        return;
      }
    }
  }
}

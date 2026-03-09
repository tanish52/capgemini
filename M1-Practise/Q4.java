import java.util.*;
public class Q4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int count=0;

    int num=sc.nextInt();
    int diff=sc.nextInt();
    for(int i=0;i<arr.length;i++){
      if(Math.abs(arr[i]-num)==diff){
        count++;
      }
    }
    System.out.println(count);
  }
}

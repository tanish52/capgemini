import java.util.*;
public class Q6 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int max=Integer.MIN_VALUE;
    int smax=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int smin=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      if(i%2==0){
        if(arr[i]>max){
        smax=max;
        max=arr[i];}
        else if(arr[i]>smax){
          smax=arr[i];
        }
      }
    
      else{
        if(arr[i]<min){
        smin=min;
        min=arr[i];
      }
      else if(arr[i]<smin){
          smin=arr[i];
        }
      }
    }
    System.out.println(smin+smax);
  }
}

import java.util.*;
public class Q22 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
   }
   int min=arr[0];
   int max=arr[0];
   int sum=0;
   for(int i=0;i<arr.length;i++){
    sum+=arr[i];
    if(arr[i]<min)min=arr[i];
    if(arr[i]>max)max=arr[i];
   }
   int esum=0;
   for(int i=min;i<=max;i++){
    esum+=i;
   }
   System.out.println(esum-sum);
  }
}

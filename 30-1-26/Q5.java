import java.util.*;

public class Q5{
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    // selection sort

    for(int i=0;i<arr.length-1;i++){
      int minindex=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[minindex]){
          minindex=j;
        }
      }
      int temp=arr[i];
      arr[i]=arr[minindex];
      arr[minindex]=temp;
    }

    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
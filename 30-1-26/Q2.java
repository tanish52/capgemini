import java.util.*;

public class Q2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

      for(int i=1;i<arr.length;i++){
        int j=i-1;
        int k=arr[i];
        while(j!=-1 && arr[j]>k){
          arr[j+1]=arr[j];
          j--;
        }
        arr[j+1]=k;
      }

      
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}

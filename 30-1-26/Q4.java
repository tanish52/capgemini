import java.util.*;

public class Q4 {

  static int  findpivot(int[] arr,int si,int ei){
    int pivot=arr[ei];
    int j=si-1;
    for(int i=si;i<ei;i++){
      if(arr[i]<pivot){
        j++;
        int temp=arr[i];
        arr[i]=arr[j];
          arr[j]=temp;
        
      }// pivot is at ei for now
    }
    j++; // j is the position where pivot should be placed 
    int temp=arr[j];
    arr[j]=pivot;
    arr[ei]=temp;
    return j;
  }
  static void quicksort(int [] arr,int si,int ei){
    if(si>=ei)return;
    int pivot=findpivot(arr,si,ei);
    quicksort(arr, si, pivot-1);
    quicksort(arr, pivot+1, ei);
  }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    quicksort(arr, 0,arr.length-1);

      for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}

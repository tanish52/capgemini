import java.util.*;

public class Q3 {

  static void merge(int[] arr,int si,int ei){
    if(si>=ei)return;
    int mid=si+(ei-si)/2;
    merge(arr, si, mid);
    merge(arr, mid+1, ei);
    conquer(arr,si,mid,ei);
  }

  static void conquer(int [] arr, int si,int mid,int ei){
    int [] merged=new int[ei-si+1];
    int idx1=si;
    int idx2=mid+1;
    int idx=0;
    while(idx1<=mid && idx2<=ei){
      if(arr[idx1]<arr[idx2]){
      merged[idx++]=arr[idx1++];
      }
      else{
        merged[idx++]=arr[idx2++];
      }
    }

    while(idx1<=mid){
      merged[idx++]=arr[idx1++];
    }

    while(idx2<=ei){
      merged[idx++]=arr[idx2++];
    }
    int j=si;

    for(int i=0;i<merged.length;i++){
      arr[j++]=merged[i];
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    merge(arr,0,arr.length-1);

     for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}

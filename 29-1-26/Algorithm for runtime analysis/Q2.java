import java.util.*;
public class Q2 {
  static void bubblesort(int [] arr){
     long start = System.nanoTime();
    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;}
      }
    }
     long end = System.nanoTime();
      System.out.println("Time: " + (end - start)/1e6 + " ms");
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
  }

  static void mergesort(int [] arr,int si,int ei){
    if(si>=ei)return;
    int mid=si+(ei-si)/2;
    mergesort(arr, si, mid);
    mergesort(arr, mid+1, ei);
    conquer(arr,si, ei, mid);
  }

  static void conquer(int []arr,int si,int ei,int mid){
    int x1=si;
    int x2=mid+1;
    int x=0;
    int merged[]=new int[ei-si+1];
    while(x1<=mid && x2<=ei){
      if(arr[x1]<=arr[x2]){
        merged[x++]=arr[x1++];
      }
      else{
        merged[x++]=arr[x2++];
      }
    }
    while(x1<=mid){
      merged[x++]=arr[x1++];
    }
    while(x2<=ei){
      merged[x++]=arr[x2++];
    }
    int j=si;
    for(int k=0;k<merged.length;k++){
      arr[j++]=merged[k];
    }
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    bubblesort(arr);
    System.out.println();
    int[] arr2 = arr.clone(); 
    long start = System.nanoTime();
    mergesort(arr2, 0, arr2.length-1);
    long end = System.nanoTime();
    System.out.println("Merge Sort Time: " + (end - start)/1e6 + " ms");
    for(int i=0;i<arr2.length;i++){
      System.out.print(arr2[i]+" ");
    }
    System.out.println();
  }
}

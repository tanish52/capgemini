import java.util.*;
class Q1{
  static void linearsearch(int [] arr,int tar){
    long start = System.nanoTime();
    for(int i=0;i<arr.length;i++){
      if(arr[i]==tar){
        System.out.println("found");
        long end = System.nanoTime();
         System.out.println("Time: " + (end - start)/1e6 + " ms");
        return;
      }
    }
    System.out.println("Not Found");
  }

  static void binarysearch(int [] arr,int tar){
    int left=0;
    int right=arr.length-1;
     long start = System.nanoTime();
    while(left<=right){
      int mid=left+(right-left)/2;
      if(arr[mid]==tar){
        System.out.println("Found");
          long end = System.nanoTime();
           System.out.println("Time: " + (end - start)/1e6 + " ms");
        return;
      }
      else if(arr[mid]<tar){
        left=mid+1;
      }
      else{
        right=mid-1;
      }
    }
    System.out.println("Not Found");
    

  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int target=sc.nextInt();
  
    linearsearch(arr,target);
      Arrays.sort(arr);
    System.out.println();
    binarysearch(arr, target);

  }
}
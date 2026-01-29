package linearandbinarysearch;

import java.util.*;

public class Q8 {
  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int target=sc.nextInt();
        int firstoccur=-1;
        int lastoccur=-1;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
          int mid=left+(right-left)/2;
          if(arr[mid]==target){
            firstoccur=mid;
            right=mid-1;
          }
          else if(arr[mid]>target){
            right=mid-1;
          }
          else{
            left=mid+1;
          }

        }
          left = 0;
        right = arr.length - 1;

        while(left<=right){
          int mid=left+(right-left)/2;
          if(arr[mid]==target){
            lastoccur=mid;
            left=mid+1;
          }
          else if(arr[mid]>target){
            right=mid-1;
          }
          else{
            left=mid+1;
          }

        }

        System.out.println("first occurence "+firstoccur);
        System.out.println();
        System.out.println("Last occurence "+lastoccur);
  }
}

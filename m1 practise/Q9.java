import java.util.*;
public class Q9 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]={5,0,7,6};
    int idx=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
        idx++;
      }
    }
    for(int i:arr){
      System.out.print(i+" ");
    }
  }
}

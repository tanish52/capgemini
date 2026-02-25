public class Q4 {
  public static void main(String[] args) {
    int arr[]={2,7,3,1,9};
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[j]-arr[i]>max){
          max=arr[j]-arr[i];
        }
      }
    }
    System.out.print(max);
  }
}

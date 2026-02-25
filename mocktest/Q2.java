public class Q2{
  public static void main(String[] args) {
    int arr[]={10,20,30,40,50,60};
    int next=arr[0];
    for(int i=0;i<arr.length-2;i+=2){
      int temp=arr[i+2];
      arr[i+2]=next;
      next=temp;
          
    }
    arr[0]=next;
     for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  } 
  }
}
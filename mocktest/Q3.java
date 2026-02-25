public class Q3 {
  public static void main(String[] args) {
    int [] arr={1,2,3,4,10};
    int left=0;
    int sum=0;
    boolean issplit=false;
   for(int i:arr){
    sum+=i;
   }
   int leftsum=0;
   for(int i:arr){
    leftsum+=i;
    if(leftsum==sum-leftsum){
      issplit=true;
      break;
    }
   }
    if(issplit){
      System.out.print("Yes ");
    }
    else{
      System.out.print("No");
    }
  }
}

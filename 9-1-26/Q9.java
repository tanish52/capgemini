import java.util.*;
public class Q9 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
    int sum=0;
    while(temp>0){
      int digit=temp%10;
      sum+=Math.pow(digit,3);
      temp/=10;
    }
    if(sum==n){
      System.out.println("Is Armstrong");
    }
    else{
      System.out.println("Not Armstrong");
    }
  }  
}

import java.util.*;
public class Q11 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean isprime=true;
    if(n<=1){
      System.out.println("Not Prime");
    }
    if(n==2){
      System.out.println("Prime");
    }
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0){
        isprime=false;
        break;
      }
    }
    if(isprime){
      System.out.println("Prime");
    }
    else{
      System.out.println("Not Prime");
    }
  }
}

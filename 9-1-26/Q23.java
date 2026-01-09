import java.util.*;
public class Q23 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int i=0;
      while(n>0){
          int digit=n%10;
          i++;
          if(i%2==0){sum+=digit;}
        n/=10;
      }
      System.out.println(sum);
  }
}

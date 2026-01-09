import java.util.*;
public class Q21 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int oddcount=0;
    int evencount=0;
    while(n>0){
      int digit=n%10;
      if(digit%2==0){
        evencount++;
      }
      else{
        oddcount++;
      }
      n=n/10;
    }
    System.out.println("Evencount is "+ evencount+" Oddcount is "+oddcount);
  }
}

import java.util.*;
public class Q13 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int rev=0;
    while (n>0) {
      int dig=n%10;
      rev=rev*10+dig;
      n/=10;
    }
    System.out.println(rev);
  }
}

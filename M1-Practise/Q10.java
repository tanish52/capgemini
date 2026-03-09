import java.util.Scanner;

public class Q10 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int carry=0;
    int count=0;
    while(n>0 || m>0){
      int dig1=n%10;
      int dig2=m%10;
      n/=10;
      m/=10;
      if(dig1+dig2+carry>9){
        carry=1;
        count++;
      }
      else{
        carry=0;
      }
    }
    System.out.println(count);
  }
}

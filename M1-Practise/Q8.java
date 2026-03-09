import java.util.*;
public class Q8 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num = sc.nextInt();
    int n = sc.nextInt();

    String ans = "";
    while(num > 0){

      int quotient = num/n;
      int remainder= num%n;

      if(remainder < 10){
        ans = remainder + ans;
      }else if(remainder <= 35){
        ans = (char)('A' + (remainder-10)) + ans;
      }

      num /=n;
    }

    System.out.println(ans);
  }
}

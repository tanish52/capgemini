import java.util.*;
public class Q5 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=m;i++){
      if(i%n!=0){
        sum+=i;
      }
    }
    System.out.println(sum);
  }
}

import java.util.*;
public class Q2 {
  public static int totalhandshake(int n){
    return (n*(n-1))/2;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int numberOfHandshake=sc.nextInt();
    System.out.println(totalhandshake(numberOfHandshake));
  }
}

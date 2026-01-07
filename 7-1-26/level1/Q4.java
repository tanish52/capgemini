import java.util.*;
public class Q4 {
  public static int checknumber(int a){
    if(a>0){
      return 1;
    }
    else if(a==0){
      return 0;
    }
    else{
      return -1;
    }
  }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number1=sc.nextInt();
    System.out.println(checknumber(number1));
  }
}

import java.util.Scanner;

public class Q13 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int max=0;
    int num=0;
    
    for(int i=a;i<=b;i++){
      int temp=i;
      int count=0;
      while(temp%2==0){
        temp/=2;
        count++;
      }
      if(count>max){
        max=count;
        num=i;
      }
    }
    System.out.println(num);
  }
}

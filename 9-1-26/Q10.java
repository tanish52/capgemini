import java.util.*;
public class Q10 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int min=Math.min(a,b);
    int hcf=0;
    for(int i=1;i<=min;i++){
      if(a%i==0 && b%i==0){
        hcf=i;
      }
    }
   
    int lcm=(a*b)/hcf;
    System.out.println("lcm is "+lcm+" hcf is "+hcf);

  }
  
}

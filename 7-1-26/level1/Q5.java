import java.util.*;

public class Q5 {
  public static String checkspringseason(int m,int d){
    if((m>=3 && d>=20)|| m==4||m==5||(m==6 &&d<=20)){
      return "Its a Spring Season";
    }
    else{
      return "Not a Spring Season";
    }
  }
  public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int season=sc.nextInt();
       int day=sc.nextInt();
       System.out.println(checkspringseason(season,day));
  }
}

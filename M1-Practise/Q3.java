import java.util.*;
import java.util.regex.*;
public class Q3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String password=sc.next();
    String regex="^[^0-9](?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[^ /]{3,}$";
    if(Pattern.matches(regex,password)){
      System.out.println("Correct Password");
    }
    else{
      System.out.println("Incorrect Password");
    }
  }
  
}

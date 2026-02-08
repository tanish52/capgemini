import java.util.*;
import java.util.regex.*;
public class Q6{
  static boolean checkdate(String s){
    String regex="^(0[1-9]|[12][0-9]|[3][01])/"+"([0][1-9]|[1][0-2])"+"/[0-9]{4}$";
    Pattern pattern=Pattern.compile(regex);
    Matcher matcher=pattern.matcher(s);

    return matcher.matches();
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
  }
}
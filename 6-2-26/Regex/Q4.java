import java.util.*;
import java.util.regex.*;
public class Q4 {
  public static void main(String[] args) {
    String regrex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

    String s="Contact us at support@example.com and info@company.org";
    Pattern pattern=Pattern.compile(regrex);
    Matcher match=pattern.matcher(s);
    while(match.find()){
      System.out.println(match.group());
    }
  }
}

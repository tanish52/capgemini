import java.util.*;
public class Q2 {
  static boolean isValidNumber(String s){
    String regrex="^[A-Z]{2}[0-9]{4}$";
    return s.matches(regrex);
  }
  public static void main(String[] args) {
    System.out.println(isValidNumber("PB2806"));
  }
}

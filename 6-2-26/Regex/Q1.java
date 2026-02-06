import java.util.*;
public class Q1{
  static boolean isValidUser(String s){
    String regrex="^[A-Za-z][A-Za-z0-9_]{4,14}$";
    return s.matches(regrex);
  }
  public static void main(String[] args) {
    System.out.println(isValidUser("user_123"));
    System.out.println(isValidUser("123user"));
  }
}
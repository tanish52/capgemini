  import java.util.*;
  public class Q3 {
    static boolean isValid(String s){
      String regrex="^[#]{1}[A-Fa-f0-9]{6}$";
      return s.matches(regrex);
    }
    public static void main(String[] args) {
      System.out.println(isValid("#dajg21"));
    }
  }

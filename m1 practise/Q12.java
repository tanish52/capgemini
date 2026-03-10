import java.util.*;
public class Q12 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int countupper=0;
    int countlower=0;
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++){
      if(Character.isUpperCase(s.charAt(i))){
        countupper++;
      }
      else if(Character.isLowerCase(s.charAt(i))){
        countlower++;
      }
    }
    if(countupper>countlower){
      s=s.toUpperCase();
    }
    else{
      s=s.toLowerCase();
    }
    System.out.println(s);
  }
}

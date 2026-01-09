import java.util.*;
public class Q7 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    str=str.toLowerCase();
    Boolean ispanagram=true;
    for(char ch='a';ch<='z';ch++){
      if(str.indexOf(ch)==-1){
        ispanagram=false;
        break;
      }
      
    }
    if(ispanagram){
        System.out.println("Is panagram");
      }
      else{
        System.out.println("not ispanagaram");
      }

  }
}

import java.util.*;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        
      String result="";
              for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(i==0){
                  result+=Character.toUpperCase(ch);
                }
                else if(s.charAt(i-1)==' ' && s.charAt(i)!=' '){
                 result+= Character.toUpperCase(ch);
                }
                else{
                  result+=ch;
                }
              }
        System.out.println(result);
      }}
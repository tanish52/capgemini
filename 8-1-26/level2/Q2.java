package level2;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int len = findLength(s);

        String[] res = customSplit(s, len);

        String[] temp = s.split("\\s+");

        if(res.length == temp.length){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }

    public static int findLength(String var0) {
      int var1 = 0;

      while(true) {
         try {
            var0.charAt(var1);
         } catch (RuntimeException var3) {
            return var1;
         }

         ++var1;
      }
   }

   public static String[] customSplit(String s, int len){

    int words = 0;

    if(s.charAt(0) != ' '){
        words++;
    }

    for(int i = 1; i < len; i++){

        
        if(s.charAt(i) != ' ' && s.charAt(i-1) == ' '){
            words ++;
        }
    }

    


    String arr[] = new String[words];

    int index = 0;

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < len; i++){
        if(s.charAt(i) == ' '){
            if(sb.length() > 0){
                arr[index] = sb.toString();
                index++;
                sb = new StringBuilder("");
            }
        }else{
            sb.append(s.charAt(i));
        }
    }

    if(sb.length() > 0){
        arr[index] = sb.toString();
    }

    return arr;

}
}
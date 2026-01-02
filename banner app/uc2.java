import java.util.Scanner;

public class uc2 {
  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
 
     String[] O = {
            " *****   ",
            "*     *  ",
            "*     *  ",
            "*     *  ",
            "*     *  ",
            "*     *  ",
            " *****   "
        };

        // Letter P (7 x 9)
        String[] P = {
            " *****   ",
            "*     *  ",
            "*     *  ",
            " *****   ",
            "*        ",
            "*        ",
            "*        "
        };

        // Letter S (7 x 9)
        String[] S = {
            " *****   ",
            "*        ",
            "*        ",
            " *****   ",
            "       * ",
            "       * ",
            " *****   "
        };
     for(int i=0;i<7;i++){
      String line=String.join(" ",O[i],O[i],P[i],S[i]);

      
      System.out.println(line);

  
     }
    
  }
}

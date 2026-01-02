import java.util.Scanner;

public class uc3 {
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

      String []Opattern=getpatternO();
     String []Ppattern=getpatternP();
     String []Spattern=getpatternS();
     String[] banner=new String[7];
      for(int i=0;i<7;i++){
        banner[i]=String.join(" ",Opattern[i],Opattern[i],Ppattern[i],Spattern[i]);
      }
     
     
      printpattern(banner);
  }
  public static String[] getpatternO(){
      return new String[]{
          "  *****  ",
            "*     *  ",
            "*     *  ",
            "*     *  ",
            "*     *  ",
            "*     *  ",
            " *****   "};
    }
      public static String[] getpatternP(){
      return new String[]{
           " *****   ",
            "*     *  ",
            "*     *  ",
            " *****   ",
            "*        ",
            "*        ",
            "*        "};
    }

       public static String[] getpatternS(){
      return new String[]{
           " *****   ",
            "*        ",
            "*        ",
            " *****   ",
            "       * ",
            "       * ",
            " *****   "};
    }

     public static void printpattern(String [] arr){
        for(int i=0;i<7;i++){
          System.out.println(arr[i]);
        }
     }
}



  


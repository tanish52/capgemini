import java.util.*;
import java.io.*;
public class Q4 {
  public static void main(String[] args) {
    try(BufferedReader br=new BufferedReader(new FileReader("Q1.csv"))){
      String line;
      line=br.readLine();
      while((line=br.readLine())!=null){
        String colums[]=line.split(",");
        int marks=Integer.parseInt(colums[3]);
        if(marks>80){
          System.out.println(line);
        }
      }

    }
    catch(IOException i){
      System.out.println("Exception Handled");
    }
  }
}

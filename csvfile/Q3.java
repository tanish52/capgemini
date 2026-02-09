import java.util.*;
import java.io.*;
public class Q3 {

  public static void main(String[] args) {
    int count=0;
    try(BufferedReader br=new BufferedReader(new FileReader("Q1.csv"))){
      boolean isHeader=true;
      String line;
      while((line=br.readLine())!=null){
        if(isHeader){
          isHeader=false;
          continue;
        }
        count++;
      }
      System.out.println(count);

    }
    catch(IOException i){
      System.out.println("Exception Handled");
    }
  }
}

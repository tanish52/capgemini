import java.util.*;
import java.io.*;
public class Q6 {
  public static void main(String[] args) {
    try(BufferedReader br=new BufferedReader(new FileReader("Q6input.txt"))){
      String line;
      while((line=br.readLine())!=null){
        if(line.toLowerCase().contains("word")){
          System.out.println(line);
        }
      }
    }
    catch(IOException i){
      System.out.println("Exception Hnadled Successfully");
    }
  }
}

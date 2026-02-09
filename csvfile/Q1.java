import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q1{
  public static void main(String[] args) {
    try(BufferedReader br=new BufferedReader(new FileReader("Q1.csv"))){
      String line;
      while ((line=br.readLine())!=null) {
        String colums[]=line.split(",");
        System.out.println(colums[0]+colums[1]+colums[2]);
      }
    }
    catch(IOException i){
      System.out.println("Exception Handled");
    }
  }
}
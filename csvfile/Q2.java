import java.util.*;
import java.io.*;
public class Q2 {
  public static void main(String[] args) {
    try(BufferedWriter bw=new BufferedWriter(new FileWriter("Q2output.csv"))){
      bw.write("name,department,id");
      bw.newLine();
      bw.write("name,department,id");
      bw.newLine();
      bw.write("name,department,id");
      bw.newLine();
      bw.write("name,department,id");
      bw.newLine();
      bw.write("name,department,id");

    }
    catch(IOException i){
      System.out.println("Exception Hnadled");
    }
  }
}

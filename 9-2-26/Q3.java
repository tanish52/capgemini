import java.util.*;
import java.io.*;
public class Q3 {
  public static void main(String[] args) {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    try(FileWriter fw=new FileWriter("q3output.txt")){
      String name=br.readLine();
      String age=br.readLine();
      fw.write("Name "+name+"\n");
      fw.write("AGE "+age);  
    }
    catch(IOException i){
      System.out.println("Exception handled successfully");
    }
  }
}

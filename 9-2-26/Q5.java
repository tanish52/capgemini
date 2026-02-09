import java.util.*;
import java.io.*;
public class Q5 {
  public static void main(String[] args) {
    try(BufferedReader br=new BufferedReader(new FileReader("Q5input.txt"));
  BufferedWriter bw=new BufferedWriter(new FileWriter("Q5output.txt"))){
    int line;
    while((line=br.read())!=-1){
      bw.write(Character.toLowerCase((char) line));
      
    }
    System.out.println("Transferrd successfully");
  }
  catch(IOException e ){
    System.out.println("Exception Handled Successfully");
  }
  }
}

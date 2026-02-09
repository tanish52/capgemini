import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Q5 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String n=sc.nextLine().trim();
    
    try(BufferedReader br=new BufferedReader(new FileReader("Q5.csv"))){
      String line;
      br.readLine();
      while((line=br.readLine())!=null){
        String columns[]=line.split(",");
        if(columns[0].equalsIgnoreCase(n)){
          System.out.println("Department--> "+columns[1]+"Salary--> "+columns[2]);
        }
      }

    }
    catch(IOException i){
      System.out.println("Exception Handled");
    }
  }
}

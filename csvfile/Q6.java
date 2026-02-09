import java.util.*;
import java.io.*;
public class Q6 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try(BufferedReader br=new BufferedReader(new FileReader("Q5.csv"));
  BufferedWriter bw=new BufferedWriter(new FileWriter("Q6output.csv"))){
    String line;
    bw.write(br.readLine());
    bw.newLine();
    while((line=br.readLine())!=null){
      String [] colums=line.split(",");
      if(colums[1].equalsIgnoreCase("IT")){
        int salary=Integer.parseInt(colums[2]);
        salary=salary+(salary*10/100);
        bw.write(colums[0]+","+colums[1]+","+String.valueOf(salary));
        bw.newLine();
        continue;
      }
      bw.write(line);
      bw.newLine();
    }
  }
  catch(IOException i){
    System.out.println("Exception handled carefully");
  }
  }
}

import java.util.*;
import java.io.*;
public class Q1{
  public static void main(String[] args) {
    try(FileInputStream fis=new FileInputStream("q1input.txt");
  FileOutputStream fos=new FileOutputStream("q1output.txt")){
    int bytes;
    while((bytes=fis.read())!=-1){
      fos.write(bytes);
    }
    System.out.println("Done transfer");
  }
  catch(IOException i){
    System.out.println("Exception handled");
  }
  }
}
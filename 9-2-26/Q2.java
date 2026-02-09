import java.util.*;
import java.io.*;
public class Q2 {
  public static void main(String[] args) {
    long start=System.nanoTime();
    try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("q2input.txt"));
  BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("q2output.txt"))){
    byte buffer[]=new byte[4096];
    int bytes;
    while((bytes=bis.read(buffer))!=-1){
      bos.write(buffer,0,bytes);
    }
  }
  catch(IOException i){
    System.out.println("Exception Handled Successfully");
  }
  long end=System.nanoTime();
  System.out.println(end-start);
  }
}

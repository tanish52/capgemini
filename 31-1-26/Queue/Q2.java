package Queue;
import java.util.*;

class Patient{
  String name;
  int sevenity;
  Patient(String na,int sever){
    this.name=na;
    this.sevenity=sever;
  }
}
public class Q2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    PriorityQueue<Patient> pq=new PriorityQueue<>((p1,p2)->p2.sevenity-p1.sevenity);
       pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));
        while(!pq.isEmpty()){
          Patient p=pq.remove();
          System.out.println(p.name+" "+ p.sevenity);
        }
  }
}

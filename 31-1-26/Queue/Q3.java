package Queue;
import java.util.*;
public class Q3 {

  static class Stack1{
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    void push(int a){
      q1.add(a);
      return;
    }
    int pop(){
      if(q1.isEmpty()){
        return -1;
      }
     while(q1.size()>1){
        q2.add(q1.remove());
     }    
      int top= q1.remove();
      while(!q2.isEmpty()){
        q1.add(q2.remove());
      }
    return top;

     
    }
    int top(){
      while(q1.size()>1){
        q2.add(q1.remove());
      }
      int top=q1.remove();
      q2.add(top);
      while(!q2.isEmpty()){
        q1.add(q2.remove());
      }
      return top;
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Stack1 s1=new Stack1();
    s1.push(1);
    s1.push(2);
    s1.push(3);
  }
}

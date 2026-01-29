import java.util.*;

class ImplementQueue{
  Stack<Integer> s1=new Stack<>();
  Stack<Integer> s2=new Stack<>();
  void push(int x){
    s1.push(x);
    return;
  }

  void pop(){
    if(s1.isEmpty() && s2.isEmpty()){
      System.out.println("Stack is Empty");
      return;
    }
    if(s2.isEmpty()){
    while(!s1.isEmpty()){
      s2.push(s1.pop());
    }}
    s2.pop();
  }


  void peek(){
     if(s1.isEmpty() && s2.isEmpty()){
      System.out.println("Stack is Empty");
      return;
    }
      if(s2.isEmpty()){
    while(!s1.isEmpty()){
      s2.push(s1.pop());
    }}
      System.out.println("The top element is queue is "+s2.peek());
  }

  void display(){
    for(int i=s2.size()-1;i>=0;i--){
      System.out.print(s2.get(i)+" ");
    }
    for(int i=0;i<s1.size();i++){
      System.out.print(s1.get(i)+" ");
    }
    System.out.println();
  }
}

public class Q1{
  public static void main(String[] args) {
    ImplementQueue i1=new ImplementQueue();
    i1.push(1);
    i1.push(2);
    i1.push(3);
    i1.push(4);
    i1.push(5);
    i1.display();
    i1.push(6);
  i1.display();
  i1.pop();i1.pop();
  i1.display();
  }
}
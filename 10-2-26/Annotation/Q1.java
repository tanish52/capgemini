import java.util.*;
class Animal{
  void makeSound(){
    System.out.println("Animal makes Sound");
  }
}


class dog extends Animal{
  @Override
  void makeSound(){
    System.out.println("Dog Barks");
  }
}
public class Q1{
  public static void main(String[] args) {
      Animal a=new dog();
    a.makeSound();  
  }
}
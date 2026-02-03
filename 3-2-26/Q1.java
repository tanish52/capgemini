import java.util.*;
abstract class warehouseItem{
  
  abstract void show();
}

class Electronics extends warehouseItem{
  public void show(){
    System.out.println("Electronics Items");
  }
}

class Groceries extends warehouseItem{
  public void show(){
    System.out.println("Groceries Items");
  }
}

class Furniture extends warehouseItem{
  public void show(){
    System.out.println("Furniture Items");
  }
}

class Storage<T extends warehouseItem>{
    List<T> items=new ArrayList<>();
    void add(T item){
      items.add(item);
    }
    List<T> get(){
      return items;
    }
}

class Util{
  static void display(List<? extends warehouseItem> li){
    for(warehouseItem i:li){
      i.show();
    }
  }
}
public class Q1{
  public static void main(String[] args) {
    Storage<Electronics> e=new Storage<>();
    e.add(new Electronics());
    Storage<Groceries> g=new Storage<>();
    g.add(new Groceries());
    Storage<Furniture> f=new Storage<>();
    f.add(new Furniture());
    Util.display(e.get());
    Util.display(g.get());
    Util.display(f.get());
  }
}
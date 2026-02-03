import java.util.*;
  
interface MealPlan{
  void show();
} 

class vegetarian implements MealPlan{
  public void show(){
    System.out.println("Panner");
  }
}

class vegan implements MealPlan{
  public void show(){
    System.out.println("Milk");
  }
}

class Meal<T extends MealPlan>{
  T meal;
  Meal(T meal){
    this.meal=meal;
  }

  void display(){
    meal.show();
  }
}
public class Q4 {
  public static void main(String[] args) {
    Meal<vegetarian> m1=new Meal<>(new vegetarian());
    m1.display();
     Meal<vegan> m2=new Meal<>(new vegan());
    m2.display();
  }
}

package com.example;
import java.util.*;
import org.json.*;
class Car{
  int speed;
  Car(int s){
    speed=s;
  }
}
public class Q2{
  public static void main(String[] args) {
    Car c1=new Car(20);
    JSONObject j=new JSONObject();
    j.put("Speed", c1.speed);
    System.out.println(j.toString());
  }

}
package com.example;
import org.json.*;
import java.util.*;
public class Q1{
  public static void main(String[] args) {
    JSONObject a=new JSONObject();
    a.put("Name","Tanish");
    a.put("age",21);
    System.out.println(a.toString());
  }
}
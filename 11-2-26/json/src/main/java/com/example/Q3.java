package com.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import org.json.*;
import java.io.FileReader;

public class Q3 {
  public static void main(String[] args) {
    try(BufferedReader bf=new BufferedReader(new FileReader("Q3input.json"))){
      String line;
      String content;
      StringBuilder sb=new StringBuilder();
      while((line=bf.readLine())!=null){
        sb.append(line);
      }
      content=sb.toString();
      JSONObject j=new JSONObject(content);
      String name1=j.getString("name");
      String email1=j.getString("email");
      System.out.println(name1);
      System.out.println(email1);
    }
    catch(IOException i){
      System.out.println("Exception Handled");
    }
  }
}

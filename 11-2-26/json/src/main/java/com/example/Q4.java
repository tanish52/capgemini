package com.example;
import java.util.*;
import org.json.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
public class Q4 {
  public static void main(String[] args) {
    JSONObject x=new JSONObject();
          JSONObject obj1 = new JSONObject();
        obj1.put("name", "Tanish");
        obj1.put("age", 21);
             JSONObject obj2 = new JSONObject();
        obj2.put("email", "tanishsingla03@gmail.com");
        obj2.put("city", "Punjab");

        for(String a:obj2.keySet()){
          obj1.put(a,obj2.get(a));
        }
        System.out.println(obj1);
  }
}

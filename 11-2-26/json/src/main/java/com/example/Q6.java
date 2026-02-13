package com.example;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
import java.lang.*;
import org.json.*;
import java.io.*;

import org.json.JSONArray;
import org.json.JSONObject;


class aim {
  public String name;

  aim(String n){
    this.name=n;
  }

}
public class Q6{
  public static void main(String[] args) throws Exception {
   List<aim> li=new ArrayList<>();
   li.add(new aim("Bugatti"));
   li.add(new aim("Dodge"));
   li.add(new aim("Mustang"));
   ObjectMapper mapper=new ObjectMapper();
   String jsonArray=mapper.writeValueAsString(li);
  System.out.println(jsonArray);
}
}
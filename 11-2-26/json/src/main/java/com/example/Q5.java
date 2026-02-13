package com.example;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Q5{

public boolean isValidJson(String json) {
    ObjectMapper mapper = new ObjectMapper();
    try {
        mapper.readTree(json);  // try parsing
        return true;           // no exception → valid JSON
    } catch (Exception e) {
        return false;          // exception → invalid JSON
    }
}
public static void main(String[] args) {
   
}
}
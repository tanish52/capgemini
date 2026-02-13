package com.example;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class Q7 {
    public static void main(String[] args) {
        String jsonString = "[{\"name\":\"Alice\",\"age\":23}," +
                             "{\"name\":\"Bob\",\"age\":30}," +
                             "{\"name\":\"Charlie\",\"age\":27}," +
                             "{\"name\":\"David\",\"age\":22}]";

        JSONArray array = new JSONArray(jsonString);
        JSONArray filtered = new JSONArray();

        for (int i = 0; i < array.length(); i++) {
            JSONObject obj = array.getJSONObject(i);
            if (obj.getInt("age") > 25) {
                filtered.put(obj);
            }
        }

        System.out.println(filtered.toString(2)); // pretty print
    }
}

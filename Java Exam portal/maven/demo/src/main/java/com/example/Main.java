package com.example;
import org.json.simple.parser.JSONParser;

public class Main {
    public static void main(String[] args) {
        JSONParser js = new JSONObject();
        js.put("name", "test");
        js.put("password", "test");
        System.out.println(js);
    }
}
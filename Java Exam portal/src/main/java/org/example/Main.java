package org.example;
import org.json.simple.JSONObject;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        JSONObject js = new JSONObject();
        js.put("name", "test");
        js.put("password", "test");
        System.out.println(js);
    }
}

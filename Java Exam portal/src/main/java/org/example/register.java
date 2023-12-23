package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class register {
    static Scanner scanner = new Scanner(System.in);
    JSONObject json = new JSONObject();
    JSONArray jsonArray = readJson("users.json");
    login lg = new login();
    
    public void register() {
        //input values
        System.out.println("Give your username: ");
        String username = scanner.nextLine().trim();
        System.out.println("Give your password: ");
        String password = scanner.nextLine().trim();
        System.out.println("What is your role(admin/user): ");
        String role = scanner.nextLine().trim();

        //user creation
        if (role.equalsIgnoreCase("admin")) {
            System.out.println("Give the secretkey: ");
            String key = scanner.nextLine().trim();
            if (key.equals("ggwp990")) {
                json.put("username",username);
                json.put("password",password);
                json.put("role","admin");
            } else {
                System.out.println("Invalid secret key");
            }
        }

        else if (role.equalsIgnoreCase("user")) {
            json.put("username",username);
            json.put("password",password);
            json.put("role","user");
        }

        else {
            System.out.println("Give a valid user type");
            register();
        }

        jsonArray.add(json);

        try (FileWriter fileWriter = new FileWriter("users.json")) {
            fileWriter.write(jsonArray.toJSONString());
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }


        System.out.println("User created successfully. Redirecting to login...");
        lg.login();
    }
    private static JSONArray readJson(String filename) {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(filename)) {
            return (JSONArray) parser.parse(reader);
        } catch (Exception e) {
            return new JSONArray();
        }
    }
}



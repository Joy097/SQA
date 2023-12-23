package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Scanner;

public class login {

    static Scanner scanner = new Scanner(System.in);
    public void login() {

        quiz takeTest = new quiz();
        exam em = new exam();
        JSONArray jsonArray = readJson("users.json");
        int size = jsonArray.size();

        while(true){
            System.out.println("Who are you?(admin/user): ");
            String role = scanner.nextLine().trim();
            System.out.println("Give your username: ");
            String username = scanner.nextLine().trim();
            System.out.println("Give your password: ");
            String password = scanner.nextLine().trim();

            boolean c = false;

            //user creation
            for(int i=0; i<size;i++){
                JSONObject res = (JSONObject) jsonArray.get(i);

                if(role.equals("admin") && role.equals(res.get("role"))){
                    boolean check = checkUser(username,password,role,res);
                    if (check){
                        takeTest.createQuestion();
                        c=true;
                        break;
                    }
                }
                else if(role.equals("user") && role.equals(res.get("role"))){
                    boolean check = checkUser(username,password,role,res);
                    if (check){
                        em.giveExam();
                        c=true;
                        break;
                    }

                }
                else if(!role.equals("user") && !role.equals("admin")){
                    System.out.println("Give a correct type of role");
                    break;
                }
            }

            if(c){ break; }

        }
    }

    public boolean checkUser(String username,String password, String role, JSONObject res){
        if (username.equals(res.get("username")) && password.equals(res.get("password"))) {
            System.out.println("loggedin-------------");
            return true;

        } else if (username.equals(res.get("username")) && !password.equals(res.get("password"))) {
            System.out.println("The password is incorrect. Please try again");
        } else if (password.equals(res.get("password")) && !username.equals(res.get("username"))) {
            System.out.println("The username is incorrect. Please try again");
        } else {
            System.out.println("Both password and username is incorrect. Please try again");
        }
        return false;
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


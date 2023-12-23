package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.util.Scanner;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.IOException;

public class quiz {
    public void createQuestion() {
        System.out.println("Creating questions");

        Scanner scanner = new Scanner(System.in);
        //read json file
        JSONArray jsonArray = readJson("quiz.json");

        while (true) {
            JSONObject json = new JSONObject();

            //take question
            System.out.println("Give your question (press 'q' to quit): ");
            String question = scanner.nextLine().trim();

            //break from loop
            if (question.equals("q")) {
                break;
            }
            json.put("question", question);

            //take options
            System.out.println("Give your 4 options: ");
            for (int i = 1; i <= 4; i++) {
                String option = scanner.nextLine().trim();
                json.put("option" + i, option);
            }

            //take correct option
            System.out.println("Correct answer(1/2/3/4): ");
            String ans = scanner.nextLine().trim();
            json.put("answer", ans);

            //store the whole object in an array
            jsonArray.add(json);
        }

        //write the whole array in the file
        try (FileWriter fileWriter = new FileWriter("quiz.json")) {
            fileWriter.write(jsonArray.toJSONString());
            System.out.println("Questions saved to quiz.json");
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }

    //read the file
    private static JSONArray readJson(String filename) {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(filename)) {
            return (JSONArray) parser.parse(reader);
        } catch (Exception e) {
            return new JSONArray();
        }
    }
}

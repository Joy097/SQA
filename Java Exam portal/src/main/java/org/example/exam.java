package org.example;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import org.json.simple.parser.JSONParser;

public class exam {
    public void giveExam() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        JSONArray jsonArray = readJson("quiz.json");

        // Check if the array has at least two elements
        int size = jsonArray.size();

        while(true){
            int score = 0;
            System.out.println("-----Your exam starts now. Total Questions - 10 (Each Question contains 1 mark)-----");
            for (int i = 1; i <= 10; i++) {
                int ran = random.nextInt(size);
                JSONObject res = (JSONObject) jsonArray.get(ran);
                System.out.println("[Question" + i + "] " + res.get("question"));
                System.out.println("1) " + res.get("option1"));
                System.out.println("2) " + res.get("option2"));
                System.out.println("3) " + res.get("option3"));
                System.out.println("4) " + res.get("option4"));
                System.out.print("Answer(1/2/3/4): ");
                String ans = scanner.nextLine().trim();
                String actualAns = (String) res.get("answerKey");

                if (ans.equalsIgnoreCase(actualAns)) {
                    score++;
                }

            }
            System.out.println("Your score is: "+score);
            System.out.println("Do you want to give another exam?(y/n):");
            String resp = scanner.nextLine().trim();
            if(resp.equalsIgnoreCase("n")){
                break;
            }
        }


    }

    private static JSONArray readJson(String filename) {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(filename)) {
            return (JSONArray) parser.parse(reader);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONArray();
        }
    }
}

import java.util.Scanner;
public class Problem11 {
    public static void main(String[] args){
            
    Scanner myObj = new Scanner(System.in);
    System.out.print("Write the String: ");
    String str = myObj.nextLine();
    str = str.trim();
    int words=0;
    int Vowel=0;
    int Chars=0;
    int Cons=0;
        for (int i = 0; i <str.length();i++){
            char res = str.charAt(i);
            int code = (int)res;
            if (code==32){
                words++;
            }
            else{
                Chars++;
            }

            if (code==65 || code==69 || code==73 || code==79|| code==85 || code==97 || code==101 || code==105 || code==111 || code==117 ){
                Vowel++;
            }
            else{
                Cons++;
            }
        }
    System.out.println("words: " + words+" Vowel: " + Vowel+" Consonant: " + Cons+" Characters: " +Chars);
    }
}

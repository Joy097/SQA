import java.util.Scanner; 
import java.util.Random;

public class Problem13 {
    public static void main(String[] args){
        int[] array = {100,150,140,180,170,200,250,230,220,300};

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = myObj.nextInt(); 

        Random random = new Random();
        int randomIndex = random.nextInt(array.length);

        for (int i = 0; i <3; i++){
            int randomElement = array[randomIndex]; 
            if(randomElement==num){
                System.out.println("You are Lucky");
                break;
            }
        }

    }
}

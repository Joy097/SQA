import java.util.Arrays;
import java.util.Random;
public class Problem6 {
    public static void main(String[] args) {
        
        int[] array = new int[10];
        Random random = new Random();
        
       for(int i = 0; i < 10; i++){
         array[i] = random.nextInt();
    }
        Arrays.sort(array);
        
        
        System.out.println("Max: " +array[9]+", Min: "  +array[0]);
    }
}

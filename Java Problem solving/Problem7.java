import java.util.Scanner;
import java.util.ArrayList;
public class Problem7 {
    public static void main(String[] args) {
        
    int[] array = {1000,500,200,100,50,20,10,5,2,1};
    ArrayList<int[]> arr = new ArrayList<>();
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter Amount");
    int amount = myObj.nextInt(); 
    for(int i = 0; i < array.length; i++){
        if (amount>=array[i]){
            int div = amount/array[i];
            arr.add(new int[]{array[i], div});
            amount = amount%array[i];
        }
    }
        
    for (int i = 0; i < arr.size(); i++) {
        int[] row = arr.get(i);
            System.out.print(row[0] + " "+row[1]);
        System.out.println();
    }
    }
}

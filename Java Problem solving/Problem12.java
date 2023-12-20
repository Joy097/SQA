import java.util.ArrayList;
public class Problem12 {
    public static void main(String[] args){
        int [] array = {1, 2, 3,1, 2, 4, 5, 6, 4};
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]==array[i] && !arr.contains(array[i])){
                    arr.add(array[i]);
                }
            }
        }

        System.out.println("Duplicate Elements: " + arr);
    }
}

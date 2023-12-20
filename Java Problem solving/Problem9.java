import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Problem9 {
    public static void main(String[] args){
        Integer[] num = {1,2,3,4,5,6,7,8,9,0};
        List<Integer> nums = new ArrayList<>(Arrays.asList(num));
        Collections.shuffle(nums);

        System.out.println("Shuffled Array:");
        for (Integer res : nums) {
            System.out.print(res + " ");
        }
    }
}

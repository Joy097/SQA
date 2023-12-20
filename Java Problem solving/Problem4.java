import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter CGPA");
        double cgpa = myObj.nextDouble(); 

        double array[] = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double temp = 0;

       for(int i = 0; i < array.length; i++){
        for(int j = i+1; j < array.length; j++){
            if(array[i] > array[j]){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }}}
        int high = array.length-1;
        int low = 0;
        int c = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(array[mid] == cgpa){
                System.out.println("Found your CGPA at: "+mid);
                c++;
                break;
            }
            else if(cgpa > array[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(c==0){
            System.out.println("Couldn't find your CGPA");
        }
    }
}

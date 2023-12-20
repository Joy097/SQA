public class Problem2{
    public static void main(String[] args){
       double array[] = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
       double h1 = 0;
       for(int i = 0; i < array.length; i++){
        if(array[i] > h1){
            h1 = array[i];
       }
    }
    double res = 0;
        for(int i = 0; i < array.length; i++){
        if(array[i] > res && array[i] != h1){
            res = array[i];
       }
    }

    System.out.println("Second Highest number is: "+res);
}}
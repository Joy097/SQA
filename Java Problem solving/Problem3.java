public class Problem3 {
    public static void main(String[] args) {
        double array[] = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double temp = 0;
       for(int i = 0; i < array.length; i++){
        for(int j = i+1; j < array.length; j++){
            if(array[i] > array[j]){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }}}
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+"  ");
        }
    }
}

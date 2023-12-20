import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args){
        int [] ht = new int[10];
        Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"no baby: ");
            ht[i] = myObj.nextInt();
        }
        int temp = 0;
        for(int i = 0; i < ht.length; i++){
            for(int j = i+1; j < ht.length; j++){
                if(ht[i] > ht[j]){
                temp = ht[i];
                ht[i] = ht[j];
                ht[j] = temp;
            }}}
            
        System.out.println("2 lowest heights: "+ht[0]+", "+ht[1]);
    }
}

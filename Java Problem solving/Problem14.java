import java.util.Scanner; 

public class Problem14 {
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);

        int sum = 0;
        while (true){
        System.out.println("Enter Number");
        String num = myObj.nextLine(); 
            if(num.equals("q")){
                break;
            }
        try {
            int numc = Integer.parseInt(num);
            sum += numc;
        }
        catch(NumberFormatException e){
            continue;
        }

        System.out.println("sum: "+sum);
    }}
}

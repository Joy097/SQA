public class Problem15 {
    public static void main(String[] args){
        int lprc = 85000;
        int mprc = 2500;

        int discount = (lprc + mprc)*15/100;
        int Final = lprc + mprc - discount;
        
        System.out.println(Final);
    }
}

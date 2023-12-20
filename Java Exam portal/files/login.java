import java.util.Scanner;

public class login {

    static Scanner scanner = new Scanner(System.in);
    public void login() {
        //input
        while(true){
            System.out.println("Give your username: ");
            String username = scanner.nextLine().trim();
            System.out.println("Give your password: ");
            String password = scanner.nextLine().trim();

            //user creation
            if (username.equals("admin") && password.equals("1111")) {
                break;
            }
            
            else if (username.equals("admin") && !password.equals("1111")){
                System.out.println("The password is incorrect. Please try again");
            }

            else if (password.equals("1111") && !username.equals("admin")){
                System.out.println("The username is incorrect. Please try again");
            }
            else{
                System.out.println("Both password and username is incorrect. Please try again");
            }
        }
    }
}


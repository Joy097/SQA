import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);

    

    public static void main(String[] args) {
        register reg = new register();
        login lg = new login();

        System.out.println("What do you want to do? (login/register)");
        String response = scanner.nextLine().trim();

        if (response.equalsIgnoreCase("login")) {
            System.out.println("loggedin-------------");
            //verify username and password
            lg.login();
            //if user's role is admin > create question
            //if user's role is user > give quiz
            // Call your login method here if needed
        } 
        
        else if (response.equalsIgnoreCase("register")) {
            reg.register();
            System.out.println("Registered-------------");

        } 
        
        else {
            System.out.println("Invalid response");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

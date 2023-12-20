import java.util.Scanner;
public class register {
    static Scanner scanner = new Scanner(System.in);
    public void register() {
        //input
        System.out.println("Give your username: ");
        String username = scanner.nextLine().trim();
        System.out.println("Give your password: ");
        String password = scanner.nextLine().trim();
        System.out.println("What is your role(admin/user): ");
        String role = scanner.nextLine().trim();

        //user creation
        if (role.equalsIgnoreCase("admin")) {
            System.out.println("Give the secretkey: ");
            String key = scanner.nextLine().trim();
            if (key.equals("ggwp990")) {
                admin user = new admin(username, password);
                System.out.println(user.username);
            } else {
                System.out.println("Invalid secret key");
            }
        } else if (role.equalsIgnoreCase("user")) {
            user user = new user(username, password);
            System.out.println(user.username);
        } else {
            System.out.println("Give a valid user type");
        }
    }
}

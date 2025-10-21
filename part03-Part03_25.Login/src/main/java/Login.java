
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username1 = "Alex";
        String password1 = "sunshine";
        String username2 = "Emma";
        String password2 = "haskell";

        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if (!(username.equals(username1 ||
                              username) && password.equals(password1 || password2))) {
            System.out.println("Try again!");
        } else {
            System.out.println("You succesfully logged in!");
        }


    }
}

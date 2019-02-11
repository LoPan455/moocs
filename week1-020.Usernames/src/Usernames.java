
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        final String LOGGED_IN = "You are now logged into the system!";
        final String LOGIN_FAILURE = "Your username or password are invalid!";
        final String ALEX_PASSWORD = "mightyducks";
        final String EMILY_PASSWORD = "cat";

        System.out.println("Type your username: ");
        String userName = reader.nextLine();

        System.out.println("Type your password: ");
        String password = reader.nextLine();



        if (((userName.equals("alex") && password.equals(ALEX_PASSWORD)) || ((userName.equals("emily") && password.equals(EMILY_PASSWORD))))) {
            System.out.println(LOGGED_IN);
        } else {
            System.out.println(LOGIN_FAILURE);
        }

    }
}

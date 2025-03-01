import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        int length = username.length();
        String password = "";
        while (length > 0) {
            password += username.charAt(length - 1);
            length--;
        }

        String pass = scanner.nextLine();
        int counter = 0;
        while (!pass.equals(password)) {
            counter++;
            if (counter == 4) {
                System.out.println("User " + username + " blocked!");
                return;
            }
            System.out.println("Incorrect password. Try again.");
            pass = scanner.nextLine();
        }
        System.out.println("User " + username + " logged in.");
    }
}

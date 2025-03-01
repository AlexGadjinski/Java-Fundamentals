import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String username : input) {
            boolean isValid = true;
            if (username.length() < 3 || username.length() > 16) {
                continue;
            }
            for (char symbol : username.toCharArray()) {
                if (!(Character.isLetter(symbol) || Character.isDigit(symbol) || symbol == '-' || symbol == '_')) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.println(username);
            }
        }
    }
}

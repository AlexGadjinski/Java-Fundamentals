import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        isValidPassword(input);
    }

    public static void isValidPassword(String password) {
        boolean isBetweenSixAndTen = false;
        boolean isLettersAndDigitsOnly = true;
        boolean isTwoDigits = false;

        if (password.length() >= 6 && password.length() <= 10) {
            isBetweenSixAndTen = true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }

        int digitsCount = 0;
        for (int i = 0; i < password.length(); i++) {
            int current = password.charAt(i);
            if (current >= 48 && current <= 57) {
                digitsCount++;
            }
            if (current < 48 || (current > 57 && current < 65) ||
                    (current > 90 && current < 97) || current > 122) {
                isLettersAndDigitsOnly = false;
            }
        }
        if (!isLettersAndDigitsOnly) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (digitsCount >= 2) {
            isTwoDigits = true;
        } else {
            System.out.println("Password must have at least 2 digits");
        }
        if (isBetweenSixAndTen && isLettersAndDigitsOnly && isTwoDigits) {
            System.out.println("Password is valid");
        }
    }
}

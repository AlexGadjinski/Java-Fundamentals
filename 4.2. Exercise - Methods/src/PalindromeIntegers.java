import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                return;
            }
            isPalindrome(input);
        }
    }

    public static void isPalindrome(String input) {
        int[] array = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}

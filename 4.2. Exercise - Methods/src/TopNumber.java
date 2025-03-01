import java.util.Arrays;
import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        topNumber(input);
    }

    public static void topNumber(int input) {
        for (int i = 1; i <= input; i++) {
            boolean isDivisibleByEight = false;
            boolean isWithOddDigit = false;
            int[] current = Arrays.stream((i + "").split("")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            for (int j = 0; j < current.length; j++) {
                sum += current[j];
                if (current[j] % 2 != 0) {
                    isWithOddDigit = true;
                }
            }
            if (sum % 8 == 0) {
                isDivisibleByEight = true;
            }
            if (isDivisibleByEight && isWithOddDigit) {
                System.out.println(i);
            }
        }
    }
}

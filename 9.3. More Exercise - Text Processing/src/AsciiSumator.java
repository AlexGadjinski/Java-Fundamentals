import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int asciiNum1 = scanner.nextLine().charAt(0);
        int asciiNum2 = scanner.nextLine().charAt(0);

        int firstNum = Math.min(asciiNum1, asciiNum2);
        int secondNum = Math.max(asciiNum1, asciiNum2);

        int sum = 0;

        StringBuilder input = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > firstNum && input.charAt(i) < secondNum) {
                sum += input.charAt(i);
            }
        }
        System.out.println(sum);
    }
}

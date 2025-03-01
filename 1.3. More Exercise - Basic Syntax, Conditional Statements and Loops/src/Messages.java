import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String word = "";

        for (int i = 0; i < length; i++) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                word += " ";
                continue;
            }
            int numberOfDigits = input.length();
            int mainDigit = Character.getNumericValue(input.charAt(0));
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset++;
            }
            int letterIndex = offset + numberOfDigits - 1 + 97;
            char character = (char) letterIndex;
            word += character;
        }
        System.out.println(word);
    }
}

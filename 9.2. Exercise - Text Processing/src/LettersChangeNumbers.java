import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSum = 0;

        String[] elements = scanner.nextLine().split("\\s+");
//      String[] elements = scanner.nextLine().split(" +");   - по някаква причина не работи

        for (String element : elements) {
            double sum;
            int number = Integer.parseInt(element.substring(1, element.length() - 1));

            char firstLetter = element.charAt(0);
            char lastLetter = element.charAt(element.length() - 1);
            int firstLetterPosition;
            int lastLetterPosition;

            if (Character.isUpperCase(firstLetter)) {
                firstLetterPosition = firstLetter % 64;
                sum = number / (double) firstLetterPosition;
            } else {
                firstLetterPosition = firstLetter % 96;
                sum = number * (double) firstLetterPosition;
            }

            if (Character.isUpperCase(lastLetter)) {
                lastLetterPosition = lastLetter % 64;
                sum -= lastLetterPosition;
            } else {
                lastLetterPosition = lastLetter % 96;
                sum += lastLetterPosition;
            }

            totalSum += sum;
        }

        System.out.printf("%.2f", totalSum);
    }
}

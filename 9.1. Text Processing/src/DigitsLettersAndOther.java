import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (Character.isDigit(symbol)) {
                digits.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letters.append(symbol);
            } else {
                other.append(symbol);
            }
//            if (symbol >= '0' && symbol <= '9') {
//                digits.append(symbol);
//            } else if ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')) {
//                letters.append(symbol);
//            } else {
//                other.append(symbol);
//            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);
    }
}

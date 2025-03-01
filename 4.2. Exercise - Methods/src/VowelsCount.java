import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(vowelsCounter(input));
    }

    public static int vowelsCounter(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == 'a' || current == 'i' || current == 'e' || current == 'o' || current == 'u' ||
            current == 'A' || current == 'I' || current == 'E' || current == 'O' || current == 'U') {
                result++;
            }
        }
        return result;
    }
}

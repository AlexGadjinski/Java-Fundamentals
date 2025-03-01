import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (char symbol : input.toCharArray()) {
            sb.append((char) (symbol + 3));
        }
        System.out.println(sb);
    }
}

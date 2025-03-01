import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
            String asterisks = "";
            for (int i = 0; i < bannedWord.length(); i++) {
                asterisks += "*";
            }
            text = text.replace(bannedWord, asterisks);
        }
        System.out.println(text);
    }
}

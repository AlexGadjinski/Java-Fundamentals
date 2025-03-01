import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String word1 = input[0];
        String word2 = input[1];
        System.out.println(charMultiplier(word1, word2));
    }

    public static int charMultiplier(String word1, String word2) {
        int result = 0;

        int minLength = Math.min(word1.length(), word2.length());

        for (int i = 0; i < minLength; i++) {
            result += word1.charAt(i) * word2.charAt(i);
        }
        if (word1.length() > word2.length()) {
            for (int i = word2.length(); i < word1.length(); i++) {
                result += word1.charAt(i);
            }
        } else if (word2.length() > word1.length()) {
            for (int i = word1.length(); i < word2.length(); i++) {
                result += word2.charAt(i);
            }
        }
        return result;
    }
}

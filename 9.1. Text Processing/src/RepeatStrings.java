import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String result = "";

        for (String word : input) {
            for (int i = 0; i < word.length(); i++) {
                result += word;
            }
        }
        System.out.println(result);
    }
}

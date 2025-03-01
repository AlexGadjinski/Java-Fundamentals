import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String result = scanner.nextLine();

        while (result.contains(wordToRemove)) {
            result = result.replace(wordToRemove, "");
        }
        System.out.println(result);
    }
}

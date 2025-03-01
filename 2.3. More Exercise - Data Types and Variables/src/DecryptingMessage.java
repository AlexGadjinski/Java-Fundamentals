import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());
        String result = "";

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            result += (char) (input.charAt(0) + key);
        }
        System.out.println(result);
    }
}

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";

        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine();
            //result = String.format("%s %s", input, result);
            result = input + " " + result;
        }
        System.out.println(result);
    }
}

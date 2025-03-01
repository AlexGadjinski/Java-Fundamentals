import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String regex = "^([$%])(?<command>[A-Z][a-z]{2,})\\1: \\[(?<num1>[\\d]+)\\]\\|\\[(?<num2>[\\d]+)\\]\\|\\[(?<num3>[\\d]+)\\]\\|$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String decrypted = matcher.group("command") + ": ";
                decrypted += (char) Integer.parseInt(matcher.group("num1"));
                decrypted += (char) Integer.parseInt(matcher.group("num2"));
                decrypted += (char) Integer.parseInt(matcher.group("num3"));
                System.out.println(decrypted);
            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}

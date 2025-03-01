import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String result = "";
            for (int i = 0; i < input.length(); i++) {
                result = input.charAt(i) + result;
            }
            System.out.println(input + " = " + result);
        }
    }
}

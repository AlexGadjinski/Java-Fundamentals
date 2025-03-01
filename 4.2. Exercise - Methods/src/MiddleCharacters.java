import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printMiddle(input);
    }

    public static void printMiddle(String input) {
        if (input.length() % 2 != 0) {
            int middle = input.length()/2;
            System.out.print(input.charAt(middle));
        } else {
            int middle = input.length()/2 - 1;
            System.out.print(input.charAt(middle) + "" + input.charAt(middle + 1));
        }
    }
}

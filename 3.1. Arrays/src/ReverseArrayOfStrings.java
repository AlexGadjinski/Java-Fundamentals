import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        /* int length = input.length;
        String[] result = new String[length];
        for (int i = 0; i < input.length; i++) {
            result[i] = "" + input[--length];
        }
        System.out.println(String.join(" ", result)); */

        for (int i = 0; i < input.length / 2; i++) {
            String current = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = current;
        }
        System.out.println(String.join(" ", input));
    }
}

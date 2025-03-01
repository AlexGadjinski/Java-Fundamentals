import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int firstSymbol = input.indexOf('@');
            int secondSymbol = input.indexOf('|');
            int thirdSymbol = input.indexOf('#');
            int fourthSymbol = input.indexOf('*');

            String name = input.substring(firstSymbol + 1, secondSymbol);
            String age = input.substring(thirdSymbol + 1, fourthSymbol);

            System.out.printf("%s is %s years old.\n", name, age);
        }
    }
}

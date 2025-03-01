import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num2 == 0) {
            System.out.println(0);
            return;
        }

        int rest = 0;
        StringBuilder result = new StringBuilder();

        for (int i = num1.length() - 1; i >= 0; i--) {
            int currentNum = Integer.parseInt(String.valueOf(num1.charAt(i)));
            int numToAdd = (currentNum * num2) + rest;

            result.insert(0, numToAdd % 10);
            rest = numToAdd / 10;
        }
        if (rest > 0) {
            result.insert(0, rest);
        }
        System.out.println(result);
    }
}

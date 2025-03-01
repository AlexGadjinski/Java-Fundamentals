import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int current = i;
            int totalSum = 0;
            while (current != 0) {
                totalSum += current % 10;
                current = current / 10;
            }
            if (totalSum == 5 || totalSum == 7 || totalSum == 11) {
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
        }
    }
}

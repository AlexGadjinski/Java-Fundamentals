import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int specialNum = 1; specialNum <= input; specialNum++) {
            int current = specialNum;
            int sum = 0;
            while (current > 0) {
                sum += current % 10;
                current = current / 10;
            }
            boolean isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecialNum) {
                System.out.printf("%d -> True%n", specialNum);
            } else {
                System.out.printf("%d -> False%n", specialNum);
            }
        }
    }
}

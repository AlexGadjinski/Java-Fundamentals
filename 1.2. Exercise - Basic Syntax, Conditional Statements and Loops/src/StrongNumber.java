import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int numberToChange = number;
        int totalSum = 0;
        int current = 0;
        while (numberToChange > 0) {
            current = numberToChange % 10;
            numberToChange /= 10;

            int sum = current;
            for (int i = current-1; i > 0; i--) {
                sum *= i;
            }
            if (sum == 0) {
                sum = 1;
            }
            totalSum += sum;
        }
        if (totalSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

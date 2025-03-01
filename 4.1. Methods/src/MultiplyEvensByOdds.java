import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int evenSum = evenSum(input);
        int oddSum = oddSum(input);
        System.out.println(evenSum * oddSum);
    }

    public static int evenSum(int number) {
        int sum = 0;
        while (number != 0) {
            int currentNum = number % 10;
            if (currentNum % 2 == 0) {
                sum += currentNum;
            }
            number /= 10;
        }
        return sum;
    }

    public static int oddSum(int number) {
        int sum = 0;
        while (number != 0) {
            int currentNum = number % 10;
            if (currentNum % 2 != 0) {
                sum += currentNum;
            }
            number /= 10;
        }
        return sum;
    }
}

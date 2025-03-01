import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;

        while (input != 0) {
            totalSum += input % 10;
            input = input / 10;
        }
        System.out.println(totalSum);
    }
}

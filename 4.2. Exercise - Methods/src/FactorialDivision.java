import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        long factorial1 = factorial(num1);
        long factorial2 = factorial(num2);
        System.out.printf("%.2f", (double) factorial1 / factorial2);
    }

    public static long factorial(int number) {
        long result = 1;
        for (int i = number; i >= 2; i--) {
            result *= i;
        }
        return result;
    }
}

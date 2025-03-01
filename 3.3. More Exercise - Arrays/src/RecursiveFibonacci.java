import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        System.out.println(fib(input));
    }
    public static int fib(int input) {
        if (input == 2 || input == 1) {
            return 1;
        } else {
            return fib(input - 1) + fib(input - 2);
        }
    }
}

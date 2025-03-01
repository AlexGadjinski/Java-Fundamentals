import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int printNum = 1;
        int sum = 0;

        for (int counter = 1; counter <= number; counter++) {
            System.out.println(printNum);
            sum += printNum;
            printNum += 2;
        }
        System.out.println("Sum: " + sum);
    }
}

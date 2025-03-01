import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = Integer.parseInt(scanner.nextLine());

        BigDecimal totalSum = new BigDecimal(0);

        while (numberCount > 0) {
            BigDecimal input = new BigDecimal(scanner.nextLine());
            totalSum = totalSum.add(input);
            numberCount--;
        }
        System.out.println(totalSum);
    }
}

import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal num1 = new BigDecimal(scanner.nextLine());
        BigDecimal num2 = new BigDecimal(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);
        int compare = num1.compareTo(num2);
        switch (compare) {
            case 1:
                sum = sum.add(num1);
                sum = sum.subtract(num2);
                break;
            case -1:
                sum = sum.add(num2);
                sum = sum.subtract(num1);
                break;
        }
        BigDecimal precision = new BigDecimal("0.000001");
        if (sum.compareTo(precision) > 0) {
            System.out.println("False");
        } else if (sum.compareTo(precision) < 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

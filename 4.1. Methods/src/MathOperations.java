import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);
        double num2 = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");
        double result = calculate(num1, num2, symbol);
        System.out.println(df.format(result));
    }

    public static double calculate(double num1, double num2, char operator) {
        double result = 0.0;
        switch (operator) {
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
        }
        return result;
    }
}

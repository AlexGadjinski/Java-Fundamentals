import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int result = 0;

        switch (input) {
            case "add":
                result = add(num1, num2);
                break;
            case "multiply":
                result = multiply(num1, num2);
                break;
            case "subtract":
                result = subtract(num1, num2);
                break;
            case "divide":
                result = divide(num1, num2);
                break;

        }
        System.out.println(result);
    }
    public static int add(int number1, int number2) {
        return number1 + number2;
    }
    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }
    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }
    public static int divide(int number1, int number2) {
        return number1 / number2;
    }
}

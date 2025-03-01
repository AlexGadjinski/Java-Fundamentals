import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num2 > 10) {
            System.out.println(num1 + " X " + num2 + " = " + num1*num2);
        } else {
            for (int i = num2; i <= 10; i++) {
                System.out.println(num1 + " X " + i + " = " + num1*i);
            }
        }
    }
}

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            String num1 = "";
            String num2 = "";
            boolean isReady = false;
            for (int j = 0; j < input.length(); j++) {
                if (isReady) {
                    num2 += input.charAt(j);
                    continue;
                }
                if (input.charAt(j) == 32) {
                    isReady = true;
                    continue;
                }
                num1 += input.charAt(j);
            }
            long n1 = Long.parseLong(num1);
            long n2 = Long.parseLong(num2);
            int sum = 0;
            if (n1 > n2) {
                while (n1 != 0) {
                    sum += n1 % 10;
                    n1 /= 10;
                }
            }  else {
                while (n2 != 0) {
                    sum += n2 % 10;
                    n2 /= 10;
                }
            }
            System.out.println(Math.abs(sum));
        }
    }
}

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] input = new String[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextLine();
            sum += Integer.parseInt(input[i]);
        }
        System.out.println(String.join(" ", input));
        System.out.println(sum);
    }
}

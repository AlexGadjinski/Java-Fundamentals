import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalSpices = 0;
        int days = 0;

        while (startingYield >= 100) {
            totalSpices += startingYield;
            totalSpices -= 26;

            startingYield -= 10;
            days++;
        }
        if (days > 0) {
            totalSpices -= 26;
        }
        System.out.println(days);
        System.out.println(totalSpices);
    }
}

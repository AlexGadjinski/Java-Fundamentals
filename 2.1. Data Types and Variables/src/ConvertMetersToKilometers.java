import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meters = Integer.parseInt(scanner.nextLine());

        double kilometres = (double) meters / 1000;
        //double kilometres = meters / 1000.0;
        System.out.printf("%.2f\n", kilometres);
    }
}

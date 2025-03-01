import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (age < 0 || age > 122) {
            System.out.println("Error!");
            return;
        }
        switch (day) {
            case "Weekday":
                if (age <= 18) {
                    System.out.println("12$");
                } else if (age <= 64) {
                    System.out.println("18$");
                } else {
                    System.out.println("12$");
                }
                break;
            case "Weekend":
                if (age <= 18) {
                    System.out.println("15$");
                } else if (age <= 64) {
                    System.out.println("20$");
                } else {
                    System.out.println("15$");
                }
                break;
            case "Holiday":
                if (age <= 18) {
                    System.out.println("5$");
                } else if (age <= 64) {
                    System.out.println("12$");
                } else {
                    System.out.println("10$");
                }
                break;
        }
    }
}

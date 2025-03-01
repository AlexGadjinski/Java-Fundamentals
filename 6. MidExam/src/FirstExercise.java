import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        int freeFlour = students / 5;

        double neededMoney = (apronPrice * (Math.ceil(students + (students * 20 / 100.0))))
                + (eggPrice * 10 * students)
                + (flourPrice * (students - freeFlour));

        if (budget >= neededMoney) {
            System.out.printf("Items purchased for %.2f$.\n", neededMoney);
        } else {
            System.out.printf("%.2f$ more needed.\n", neededMoney - budget);
        }
    }
}

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int newMinutes = (minutes + 30) % 60;
        if (newMinutes < minutes) {
            hours += 1;
            hours %= 24;
        }

        /* if (newMinutes < 10) {
            System.out.println(hours + ":0" + newMinutes);
        } else {
            System.out.println(hours + ":" + newMinutes);
        } */
        System.out.printf("%d:%02d", hours, newMinutes);
    }
}

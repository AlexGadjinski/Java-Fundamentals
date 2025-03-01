import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int a1 = Integer.parseInt(scanner.nextLine());
        int b1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int b2 = Integer.parseInt(scanner.nextLine());

        double distance1 = distance(x1, x2, y1, y2);
        double distance2 = distance(a1, a2, b1, b2);

        if (distance1 >= distance2) {
            printClosestPoint(x1, y1, x2, y2);
        } else {
            printClosestPoint(a1, b1, a2, b2);
        }
    }

    public static double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    }

    public static void printClosestPoint(int x1, int y1, int x2, int y2) {
        double distance1 = Math.sqrt((x1 * x1) + (y1 * y1));
        double distance2 = Math.sqrt((x2 * x2) + (y2 * y2));

        if (distance1 <= distance2) {
            System.out.printf("(%d, %d)", x1, y1);
            System.out.printf("(%d, %d)", x2, y2);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
            System.out.printf("(%d, %d)", x1, y1);
        }
    }
}

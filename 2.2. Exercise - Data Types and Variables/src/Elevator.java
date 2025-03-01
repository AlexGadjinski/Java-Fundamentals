import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        /* byte result = 0;
        while (people > 0) {
            people -= capacity;
            result++;
        }
        System.out.println(result); */

        int result = (int) Math.ceil(((double) people) / capacity);
        System.out.println(result);
    }
}

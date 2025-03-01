import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;

        while (number > 0) {
            String input = scanner.nextLine();
            totalSum += input.charAt(0);
            // правим фактически имплицитно каст-ване, на int променлива присвояваме char променлива
            number--;
        }
        System.out.println("The sum equals: " + totalSum);
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        for (int i = 0; i < numbers.size(); i++) {
            int sum = 0;
            int number = numbers.get(i);
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            System.out.print(input.charAt(sum % input.length()));

            String string1 = input.substring(0, sum % input.length());
            String string2 = input.substring(sum % input.length() + 1);
            input = string1 + string2;
        }
    }
}

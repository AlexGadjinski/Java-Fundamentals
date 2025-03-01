import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDoNotGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;

        while (!input.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index < input.size()) {
                int number = input.get(index);
                input.remove(index);
                sum += number;
                for (int i = 0; i < input.size(); i++) {
                    if (input.get(i) <= number) {
                        input.set(i, input.get(i) + number);
                    } else {
                        input.set(i, input.get(i) - number);
                    }
                }
            } else if (index < 0) {
                int numberToCopy = input.get(input.size() - 1);
                int number = input.get(0);
                sum += number;

                input.remove(0);
                input.add(0, numberToCopy);

                for (int i = 0; i < input.size(); i++) {
                    if (input.get(i) <= number) {
                        input.set(i, input.get(i) + number);
                    } else {
                        input.set(i, input.get(i) - number);
                    }
                }
            } else {
                int numberToCopy = input.get(0);
                int number = input.get(input.size() - 1);
                sum += number;

                input.remove(input.size() - 1);
                input.add(numberToCopy);

                for (int i = 0; i < input.size(); i++) {
                    if (input.get(i) <= number) {
                        input.set(i, input.get(i) + number);
                    } else {
                        input.set(i, input.get(i) - number);
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<String> result = new ArrayList<>();
        for (int i = 0; i < input.size()/2; i++) {
            int num1 = input.get(i);
            int num2 = input.get(input.size() - 1 - i);
            result.add(String.valueOf(num1 + num2));
        }
        if (input.size() % 2 != 0) {
            int num = input.get(input.size()/2);
            result.add(String.valueOf(num));
        }
        System.out.println(String.join(" ", result));
    }
}

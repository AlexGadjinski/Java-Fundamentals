import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        /* for (int i = 0; i < input.size(); i++) {
            int currentNum = input.get(i);
            if (currentNum < 0) {
                input.remove(Integer.valueOf(currentNum));
                i--;
            }
        } */

        input.removeIf(num -> num < 0);

        Collections.reverse(input);
        if (input.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(input.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> deck1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> deck2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!deck1.isEmpty() && !deck2.isEmpty()) {
            int card1 = deck1.get(0);
            int card2 = deck2.get(0);
            deck1.remove(0);
            deck2.remove(0);
            if (card1 > card2) {
                deck1.add(card1);
                deck1.add(card2);
            } else if (card2 > card1) {
                deck2.add(card2);
                deck2.add(card1);
            }
        }
        int sum = 0;
        if (deck1.isEmpty()) {
            for (int num : deck2) {
                sum += num;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (int num : deck1) {
                sum += num;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
        // възможно е кодът да гърми, когато и двамата играчи имат абсолютно едни и същи карти
    }
}

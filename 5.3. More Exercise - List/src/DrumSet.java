import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> initialQuality = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> currentQuality = new ArrayList<>(initialQuality);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Hit it again, Gabsy!")) {
                break;
            }
            int hitPower = Integer.parseInt(input);
            for (int i = 0; i < currentQuality.size(); i++) {
                currentQuality.set(i, currentQuality.get(i) - hitPower);

                if (currentQuality.get(i) <= 0) {
                    double price = initialQuality.get(i) * 3;
                    if (savings - price >= 0) {
                        savings -= price;
                        currentQuality.set(i, initialQuality.get(i));
                    } else {
                        currentQuality.remove(i);
                        initialQuality.remove(i);
                        i--;
                    }
                }
            }
        }
        System.out.println(currentQuality.toString().replaceAll("[\\[\\],]", ""));
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}

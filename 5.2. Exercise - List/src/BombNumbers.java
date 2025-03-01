import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int[] bombDetails = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int specialNum = bombDetails[0];
        int power = bombDetails[1];

        while (numbers.contains(specialNum)) {
            int indexOfSpecialNum = numbers.indexOf(specialNum);
            int currentPower = power;

            for (int i = indexOfSpecialNum + 1; i < numbers.size();) {
                if (currentPower == 0) {
                    break;
                }
                numbers.remove(i);
                currentPower--;
            }
            currentPower = power;
            numbers.remove(indexOfSpecialNum);
            for (int i = indexOfSpecialNum - 1; i >= 0; i--) {
                if (currentPower == 0) {
                    break;
                }
                numbers.remove(i);
                currentPower--;
            }
        }
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        double leftRacerTime = 0;
        double rightRacerTime = 0;

        for (int i = 0; i < array.length / 2; i++) {
            leftRacerTime += array[i];
            if (array[i] == 0) {
                leftRacerTime *= 0.8;
            }
        }
        for (int i = array.length - 1; i > array.length / 2; i--) {
            rightRacerTime += array[i];
            if (array[i] == 0) {
                rightRacerTime *= 0.8;
            }
        }
        if (leftRacerTime <= rightRacerTime) {
            System.out.printf("The winner is left with total time: %.1f", leftRacerTime);
        } else {
            System.out.printf("The winner is right with total time: %.1f", rightRacerTime);
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < i; j++) {
                leftSum += input[j];
            }
            for (int j = i + 1; j < input.length; j++) {
                rightSum += input[j];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }
            leftSum = 0;
            rightSum = 0;
        }
        System.out.println("no");
    }
}

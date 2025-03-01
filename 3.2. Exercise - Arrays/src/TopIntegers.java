import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String result = "";
        boolean isBigger = true;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] <= input[j]) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                result += input[i] + " ";
            }
            isBigger = true;
        }
        System.out.println(result);
    }
}

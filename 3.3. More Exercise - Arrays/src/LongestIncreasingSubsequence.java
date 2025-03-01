import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] result = new String[0];

        /* for (int i = 0; i < input.length; i++) {
            array = new String[input.length];
            array[0] = input[i] + "";
            String[] current = longestWithStartingIndex(input,i+1);
            if (current.length > result.length) {
                result = current;
            }
        }

    }

    private static String[] array;
    private static String[] longestWithStartingIndex(int[] input, int index) {

        for (int i = index; i < input.length; i++) {
            if (Integer.parseInt(array[index - 1]) < input[i]) {
                array[index] = longestWithStartingIndex(array, index);
            }
        } */
    }
}

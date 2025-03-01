import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (input.length != 1) {
            int[] current = input;
            input = new int[input.length - 1];
            for (int i = 0; i < input.length; i++) {
                input[i] = current[i] + current[i + 1];
            }
        }
        System.out.println(input[0]);



        /* String result = Arrays.toString(input);
        String result2 = result.substring(1, result.length()-1);
        mahame skobite
        printirane kogato masivut se sustoi ot edin element
        */

        /* String result = Arrays.toString(input);
        String result2 = result.substring(1, result.length()-1);
        String[] finalResult = result2.split(", ");
        String print = String.join(" ", finalResult);
        printirane kogato masivut se sustoi ot mnogo elementi
        */
    }
}

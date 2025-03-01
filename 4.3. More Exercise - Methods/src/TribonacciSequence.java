import java.util.Arrays;
import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        /* array = new int[number];
        tribonacciArray(number - 1); */
        int[] array = tribonacciArray(number);
        System.out.println(intArrToStringArr(array));
    }
    public static int[] tribonacciArray(int number) {
        int[] array = new int[number];
        if (number >= 3) {
            array[0] = 1;
            array[1] = 1;
            array[2] = 2;
        } else if (number == 2) {
            array[0] = 1;
            array[1] = 1;
        } else if (number == 1) {
            array[0] = 1;
        }

        for (int i = 3; i < number; i++) {
            array[i] = array[i-1] + array[i-2] + array[i-3];
        }
        return array;
    }

    public static String intArrToStringArr(int[] array) {
        return Arrays.toString(array)
                .replaceAll("\\[", "")
                .replaceAll("]", "")
                .replaceAll(", ", " ");
    }

    // private static int[] array;

    /* public static int tribonacciArray(int number) {
        if (number == 0) {
            array[0] = 1;
            return 1;
        } else if (number == 1) {
            array[0] = 1;
            array[1] = 1;
            return 1;
        } else if (number == 2) {
            array[0] = 1;
            array[1] = 1;
            array[2] = 2;
            return 2;
        }
        array[number] = tribonacciArray(number - 1) + tribonacciArray(number - 2) + tribonacciArray(number - 3);
        return array[number];
    } */
}

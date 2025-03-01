import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (true) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]) {
                case "swap":
                    swap(input, Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                case "multiply":
                    multiply(input, Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                case "decrease":
                    decrease(input);
                    break;
                case "end":
                    String result = Arrays.toString(input);
                    System.out.println(result.substring(1,result.length()-1));
                    return;
            }
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        int current = array[index1];
        array[index1] = array[index2];
        array[index2] = current;
    }
    public static void multiply(int[] array, int index1, int index2) {
        int result = array[index1] * array[index2];
        array[index1] = result;
    }
    public static void decrease(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] -= 1;
        }
    }
}

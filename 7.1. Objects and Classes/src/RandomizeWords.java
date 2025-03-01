import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Random rnd = new Random();
        for (int i = 0; i < input.length; i++) {
            int position2 = rnd.nextInt(input.length);
            String last = input[i];
            input[i] = input[position2];
            input[position2] = last;
        }
        for (String s : input) {
            System.out.println(s);
        }
        //System.out.println(String.join(System.lineSeparator(), input));
    }
}

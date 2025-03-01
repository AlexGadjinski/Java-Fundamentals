import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = Arrays.stream(scanner.nextLine().split(" "))
                .filter(a -> a.length() % 2 == 0)
                .toArray(String[]::new);

//        int[] numArr = Arrays.stream(scanner.nextLine().split(" "))
//                        .mapToInt(Integer::parseInt).toArray();
//        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .filter(a -> a < 0).toArray();

        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}

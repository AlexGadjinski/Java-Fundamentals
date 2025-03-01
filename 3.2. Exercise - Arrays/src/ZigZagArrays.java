import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] array1 = new String[n];
        String[] array2 = new String[n];

        for (int i = 0; i < n; i++) {
            int[] current = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (i % 2 == 0) {
                array1[i] = current[0] + "";
                array2[i] = current[1] + "";
            } else {
                array1[i] = current[1] + "";
                array2[i] = current[0] + "";
            }
        }
        System.out.println(String.join(" ", array1));
        System.out.println(String.join(" ", array2));

        /*
        String result1 = String.join(" ", Arrays.toString(array1).split(", "));
        result1 = result1.substring(1, result1.length()-1);
        System.out.println(result1);

        в случай, че масивите са от тип int и трябва да бъдат преобразувани в String, тоест без скоби и запетаи
        */
    }
}

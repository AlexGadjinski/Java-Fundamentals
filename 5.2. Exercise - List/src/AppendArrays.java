import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";

        String[] inputArr = scanner.nextLine().split("\\|");
        for (int i = inputArr.length - 1; i >= 0; i--) {
            result += inputArr[i] + " ";
        }
        while (result.contains("  ")) {
            result = result.replaceAll("  ", " ");
        }
        while (result.charAt(0) == 32) {
           result = result.substring(1, result.length() - 1);
        }
        while (result.charAt(result.length() - 1) == 32) {
            result = result.substring(0, result.length() - 1);
        }
        System.out.println(result);
    }
}

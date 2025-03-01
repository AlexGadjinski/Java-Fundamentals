import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int asciiNum1 = scanner.nextLine().charAt(0);
        int asciiNum2 = scanner.nextLine().charAt(0);

        printAscii(asciiNum1, asciiNum2);
    }

    public static void printAscii(int asciiNum1, int asciiNum2) {
        int start = Math.min(asciiNum1, asciiNum2);
        int end = Math.max(asciiNum1, asciiNum2);

        for (int i = start + 1; i < end; i++) {
            System.out.print((char) i + " ");
        }
    }
}

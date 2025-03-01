import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i++) {
            char current1 = (char) ('a' + i);
            for (int j = 0; j < input; j++) {
                char current2 = (char) ('a' + j);
                for (int k = 0; k < input; k++) {
                    char current3 = (char) ('a' + k);
                    System.out.printf("%c%c%c\n", current1, current2, current3);
                }
            }
        }
    }
}

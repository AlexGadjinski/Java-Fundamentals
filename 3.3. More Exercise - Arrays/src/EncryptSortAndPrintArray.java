import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = new String[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                char currentSymbol = input[i].charAt(j);
                if (currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol == 'i' || currentSymbol == 'o' || currentSymbol == 'u'|| currentSymbol == 'A'|| currentSymbol == 'E'|| currentSymbol == 'I'|| currentSymbol == 'O'|| currentSymbol == 'U') {
                    result[i] += currentSymbol * input[i].length();
                } else {
                    result[i] += currentSymbol / input[i].length();
                    // тук има грешка в условието, делим реално не само при съгласни, а и при всички останали символи различни от гласни
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[j] < result[i]) {
                    int current = result[i];
                    result[i] = result[j];
                    result[j] = current;
                }
            }
        }
        for (int num: result) {
            System.out.println(num);
        }
    }
}

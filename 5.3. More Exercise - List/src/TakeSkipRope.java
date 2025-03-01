import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbersList = new ArrayList<>();
        List<String> nonNumbersList = new ArrayList<>();

        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                numbersList.add(Integer.parseInt(String.valueOf(symbol)));
            } else {
                nonNumbersList.add(String.valueOf(symbol));
            }
        }
        for (int i = 0; i < numbersList.size(); i++) {
            int number = numbersList.get(i);
            if (i % 2 == 0) {
                takeList.add(number);
            } else {
                skipList.add(number);
            }
        }

        for (int i = 0; i < takeList.size(); i++) {
            int charsToTake = takeList.get(i);
            int charsToSkip = skipList.get(i);
            for (int j = 0; j < charsToTake; j++) {
                if (nonNumbersList.isEmpty()) {
                    break;
                }
                result += nonNumbersList.get(0);
                nonNumbersList.remove(0);
            }
            for (int j = 0; j < charsToSkip; j++) {
                if (nonNumbersList.isEmpty()) {
                    break;
                }
                nonNumbersList.remove(0);
            }
        }
        System.out.println(result);
    }
}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char symbol : input.toCharArray()) {
            if (symbol != ' ') {
                map.putIfAbsent(symbol, 0);
                map.put(symbol, map.get(symbol) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}

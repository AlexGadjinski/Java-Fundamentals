import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }

            String key = input;
            int value = Integer.parseInt(scanner.nextLine());

            map.putIfAbsent(key, 0);
            map.put(key, map.get(key) + value);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

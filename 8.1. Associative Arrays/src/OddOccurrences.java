import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word : input) {
            word = word.toLowerCase();
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                result.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", result));
    }
}

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String key = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(synonym);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " - ");
            System.out.println(String.join(", ", entry.getValue()));
        }
    }
}

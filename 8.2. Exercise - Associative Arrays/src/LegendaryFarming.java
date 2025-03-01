import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shards = 0;
        int fragments = 0;
        int motes = 0;

        Map<String, Integer> junk = new LinkedHashMap<>();

        while (true) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();
                switch (material) {
                    case "shards":
                        shards += quantity;
                        break;
                    case "fragments":
                        fragments += quantity;
                        break;
                    case "motes":
                        motes += quantity;
                        break;
                    default:
                        junk.putIfAbsent(material, 0);
                        junk.put(material, junk.get(material) + quantity);
                        break;
                }
                if (shards >= 250) {
                    shards -= 250;
                    System.out.println("Shadowmourne obtained!");
                    System.out.println("shards: " + shards);
                    System.out.println("fragments: " + fragments);
                    System.out.println("motes: " + motes);
                    junk.forEach((key, value) -> System.out.println(key + ": " + value));
                    return;
                } else if (fragments >= 250) {
                    fragments -= 250;
                    System.out.println("Valanyr obtained!");
                    System.out.println("shards: " + shards);
                    System.out.println("fragments: " + fragments);
                    System.out.println("motes: " + motes);
                    junk.forEach((key, value) -> System.out.println(key + ": " + value));
                    return;
                } else if (motes >= 250) {
                    motes -= 250;
                    System.out.println("Dragonwrath obtained!");
                    System.out.println("shards: " + shards);
                    System.out.println("fragments: " + fragments);
                    System.out.println("motes: " + motes);
                    junk.forEach((key, value) -> System.out.println(key + ": " + value));
                    return;
                }
            }
        }
    }
}

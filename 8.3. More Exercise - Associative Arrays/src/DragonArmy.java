import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DragonArmy {
    int damage;
    int health;
    int armor;

    DragonArmy(String damage, String health, String armor) {

        if (damage.equals("null")) {
            this.damage = 45;
        } else {
            this.damage = Integer.parseInt(damage);
        }

        if (health.equals("null")) {
            this.health = 250;
        } else {
            this.health = Integer.parseInt(health);
        }

        if (armor.equals("null")) {
            this.armor = 10;
        } else {
            this.armor = Integer.parseInt(armor);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, TreeMap<String, DragonArmy>> typesDragons = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String type = input[0];
            String name = input[1];
            String damage = input[2];
            String health = input[3];
            String armor = input[4];

            if (!typesDragons.containsKey(type)) {
                typesDragons.put(type, new TreeMap<>());
                typesDragons.get(type).put(name, new DragonArmy(damage, health, armor));
            } else {
                typesDragons.get(type).put(name, new DragonArmy(damage, health, armor));
            }
        }

        for (Map.Entry<String, TreeMap<String, DragonArmy>> entry : typesDragons.entrySet()) {
            System.out.print(entry.getKey() + "::");

            double[] stats = {0, 0, 0};
            int dragonsCount = entry.getValue().size();

            entry.getValue().forEach((key, value) -> {
                stats[0] += value.damage;
                stats[1] += value.health;
                stats[2] += value.armor;
            });

            System.out.printf("(%.2f/%.2f/%.2f)\n", stats[0] / dragonsCount, stats[1] / dragonsCount, stats[2] / dragonsCount);

            entry.getValue().forEach((key, value) -> {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d\n", key, value.damage, value.health, value.armor);
            });
        }
    }
}

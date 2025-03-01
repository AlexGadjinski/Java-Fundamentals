import java.util.*;

public class Snowwhite2 {
    public static void main(String[] args) {
        // tazi zadacha e reshena chrez sortirane na cveta po obshtiq broi na imenata, a ne samo
        // na tezi s obsht physics
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Integer>> dwarves = new LinkedHashMap<>();
        List<Integer> physicsNumbers = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Once upon a time")) {
                break;
            }
            String[] command = input.split(" <:> ");
            String name = command[0];
            String color = command[1];
            int physics = Integer.parseInt(command[2]);

            if (!dwarves.containsKey(name)) {
                dwarves.put(name, new LinkedHashMap<>());
                dwarves.get(name).put(color, physics);
            } else {
                if (!dwarves.get(name).containsKey(color)) {
                    dwarves.get(name).put(color, physics);
                } else {
                    int lastPhysics = dwarves.get(name).get(color);
                    if (physics > lastPhysics) {
                        dwarves.get(name).put(color, physics);
                    }
                }
            }
            if (!physicsNumbers.contains(physics)) {
                physicsNumbers.add(physics);
            }
        }

        LinkedHashMap<String, Integer> mapToSortByColor = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> sortedByColor = new LinkedHashMap<>();

        dwarves.entrySet().forEach((entry -> entry.getValue().forEach((key, value) -> {
            mapToSortByColor.putIfAbsent(key, 0);
            mapToSortByColor.put(key, mapToSortByColor.get(key) + 1);
        })));

        LinkedHashMap<Integer, LinkedHashMap<String, List<String>>> mapToSortByNumber = new LinkedHashMap<>();
        LinkedHashMap<Integer, LinkedHashMap<String, List<String>>> sortedByNumber = new LinkedHashMap<>();
        mapToSortByColor.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
                .forEach(entry -> {
                    sortedByColor.put(entry.getKey(), entry.getValue());
                });
        for (Integer physicsNumber : physicsNumbers) {
            mapToSortByNumber.put(physicsNumber, new LinkedHashMap<>());
            for (String color : sortedByColor.keySet()) {
                mapToSortByNumber.get(physicsNumber).put(color, new ArrayList<>());
                dwarves.forEach((name, value) -> value.forEach((colorToAdd, number) -> {
                    if (color.equals(colorToAdd) && physicsNumber.equals(number)) {
                        mapToSortByNumber.get(physicsNumber).get(color).add(name);
                    }
                }));
            }
        }
        mapToSortByNumber.entrySet().stream()
                .sorted(Map.Entry.<Integer, LinkedHashMap<String, List<String>>> comparingByKey().reversed())
                .forEach(entry -> {
                    sortedByNumber.put(entry.getKey(), entry.getValue());
                });



        sortedByNumber.forEach((physics, value) -> value.forEach((color, list) -> {
            for (String name : list) {
                System.out.printf("(%s) %s <-> %d\n", color, name, physics);
            }
        }));
    }
}

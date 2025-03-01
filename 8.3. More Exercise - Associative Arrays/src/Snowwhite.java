import java.util.*;

public class Snowwhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Integer>> dwarves = new LinkedHashMap<>();

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
        }
        LinkedHashMap<Integer, LinkedHashMap<String, List<String>>> resultMap = new LinkedHashMap<>();
        while (!dwarves.isEmpty()) {
            int biggestPhysics = 0;
            String name = "";
            String color = "";
            for (Map.Entry<String, LinkedHashMap<String, Integer>> entry1 : dwarves.entrySet()) {
                for (Map.Entry<String, Integer> entry2 : entry1.getValue().entrySet()) {
                    if (entry2.getValue() > biggestPhysics) {
                        biggestPhysics = entry2.getValue();
                        name = entry1.getKey();
                        color = entry2.getKey();
                    }
                }
            }
            resultMap.putIfAbsent(biggestPhysics, new LinkedHashMap<>());
            if (!resultMap.get(biggestPhysics).containsKey(color)) {
                resultMap.get(biggestPhysics).put(color, new ArrayList<>());
            }
            resultMap.get(biggestPhysics).get(color).add(name);

            dwarves.get(name).remove(color);
            if (dwarves.get(name).isEmpty()) {
                dwarves.remove(name);
            }
        }


        for (Map.Entry<Integer, LinkedHashMap<String, List<String>>> mapEntry : resultMap.entrySet()) {
            int physics = mapEntry.getKey();

            LinkedHashMap<Integer, LinkedHashMap<String, List<String>>> finalMap = new LinkedHashMap<>();

            resultMap.get(physics).forEach((key, value) -> {
                finalMap.putIfAbsent(value.size(), new LinkedHashMap<>());
                finalMap.get(value.size()).putIfAbsent(key, value);
            });

            finalMap.entrySet().stream()
                    .sorted(Map.Entry.<Integer, LinkedHashMap<String, List<String>>> comparingByKey().reversed())
                    .forEach(entry -> entry.getValue().forEach((key, value) -> {
                        for (String name : value) {
                            System.out.printf("(%s) %s <-> %d\n", key, name, physics);
                        }
                    }));
        }
    }
}

//Peter <:> Red <:> 2000
//Todor <:> Blue <:> 1000
//George <:> Green <:> 1000
//Smith <:> Yellow <:> 4500
//Premis <:> Sam <:> 1000
//Debeli <:> Green <:> 1000
//Dimitri <:> Blue <:> 1000
//Once upon a time

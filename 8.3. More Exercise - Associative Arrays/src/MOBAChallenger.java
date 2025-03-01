import java.util.*;

public class MOBAChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, TreeMap<String, Integer>> players = new TreeMap<>();
        TreeMap<String, List<String>> positions = new TreeMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Season end")) {
                break;
            }

            if (input.contains(" -> ")) {
                String[] command = input.split(" -> ");
                String name = command[0];
                String position = command[1];
                int skill = Integer.parseInt(command[2]);

                if (!players.containsKey(name)) {
                    players.put(name, new TreeMap<>());
                    players.get(name).put(position, skill);
                } else {
                    if (!players.get(name).containsKey(position)) {
                        players.get(name).put(position, skill);
                    } else {
                        int lastSkill = players.get(name).get(position);
                        if (skill > lastSkill) {
                            players.get(name).put(position, skill);
                        }
                    }
                }

                positions.putIfAbsent(position, new ArrayList<>());
                if (!positions.get(position).contains(name)) {
                    positions.get(position).add(name);
                }

            } else if (input.contains(" vs ")) {
                String[] command = input.split(" vs ");
                String name1 = command[0];
                String name2 = command[1];

                boolean isValid = false;
                for (Map.Entry<String, List<String>> entry : positions.entrySet()) {
                    if (entry.getValue().contains(name1) && entry.getValue().contains(name2)) {
                        isValid = true;
                        break;
                    }
                }
                if (isValid) {
                    int firstPersonPoints = players.get(name1).values().stream()
                            .mapToInt(Integer::intValue).sum();
                    int secondPersonPoints = players.get(name2).values().stream()
                            .mapToInt(Integer::intValue).sum();
                    if (firstPersonPoints > secondPersonPoints) {
                        players.remove(name2);
                        positions.forEach((key, value) -> value.removeIf(person -> person.equals(name2)));
                    } else if (secondPersonPoints > firstPersonPoints) {
                        players.remove(name1);
                        positions.forEach((key, value) -> value.removeIf(person -> person.equals(name1)));
                    }
                }
            }
        }

        TreeMap<String, Integer> totalPoints = new TreeMap<>();
        players.forEach((key, value) -> totalPoints.putIfAbsent(key, value.values().stream()
                    .mapToInt(Integer::intValue).sum()));
        totalPoints.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue() + " skill");
                    players.get(entry.getKey()).entrySet().stream()
                            .sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
                            .forEach(current -> System.out.printf("- %s <::> %d\n", current.getKey(), current.getValue()));
                });
    }
}

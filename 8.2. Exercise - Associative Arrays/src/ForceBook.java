import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Lumpawaroo")) {
                break;
            }
            String side;
            String user;

            if (input.contains("|")) {
                boolean isExisting = false;
                String[] command = input.split(" \\| ");
                side = command[0];
                user = command[1];
                for (List<String> value : map.values()) {
                    if (value.contains(user)) {
                        isExisting = true;
                        break;
                    }
                }
                if (!isExisting) {
                    map.putIfAbsent(side, new ArrayList<>());
                    map.get(side).add(user);
                }
            } else {
                String[] command = input.split(" -> ");
                user = command[0];
                side = command[1];
                map.putIfAbsent(side, new ArrayList<>());
                map.forEach((key, value) -> value.removeIf(current -> current.equals(user)));
                map.get(side).add(user);
                System.out.printf("%s joins the %s side!\n", user, side);
            }
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                System.out.printf("Side: %s, Members: %d\n", entry.getKey(), entry.getValue().size());
                entry.getValue().forEach(member -> System.out.println("! " + member));
            }
        }
    }
}

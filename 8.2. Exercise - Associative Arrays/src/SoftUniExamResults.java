import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Integer>> map = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> languages = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exam finished")) {
                break;
            }

            String[] command = input.split("-");

            if (command[1].equals("banned")) {
               map.remove(command[0]);
               continue;
            }

            String person = command[0];
            String language = command[1];
            int points = Integer.parseInt(command[2]);

            languages.putIfAbsent(language, 0);
            languages.put(language, languages.get(language) + 1);


            map.putIfAbsent(person, new LinkedHashMap<>());

            if (!map.get(person).containsKey(language)) {
                map.get(person).put(language, points);
            } else {
                int lastPoints = map.get(person).get(language);
                if (points > lastPoints) {
                    map.get(person).put(language, points);
                }
            }
        }

        System.out.println("Results:");
        map.forEach((person, value)
                -> value.forEach((language, points)
                -> System.out.println(person + " | " + points)));
//        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : map.entrySet()) {
//            entry.getValue().forEach((key, value) -> System.out.println(entry.getKey() + " | " + value));
//        }

        System.out.println("Submissions:");
        languages.forEach((key, value) -> System.out.println(key + " - " + value));


        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();
    }
}

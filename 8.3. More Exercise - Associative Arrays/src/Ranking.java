import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        // https://www.scaler.com/topics/sort-map-by-value-in-java/
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> contests = new LinkedHashMap<>();
        TreeMap<String, HashMap<String, Integer>> contestants = new TreeMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end of contests")) {
                break;
            }
            String[] command = input.split(":");
            String contest = command[0];
            String password = command[1];

            contests.put(contest, password);
        }

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end of submissions")) {
                break;
            }
            String[] command = input.split("=>");
            String contest = command[0];
            String password = command[1];

            if (contests.containsKey(contest)) {
                if (contests.get(contest).equals(password)) {
                    String name = command[2];
                    int points = Integer.parseInt(command[3]);

                    if (!contestants.containsKey(name)) {
                        contestants.put(name, new HashMap<>());
                        contestants.get(name).put(contest, points);
                    } else {
                        if (contestants.get(name).containsKey(contest)) {
                            int lastPoints = contestants.get(name).get(contest);
                            if (points > lastPoints) {
                                contestants.get(name).put(contest, points);
                            }
                        } else {
                            contestants.get(name).put(contest, points);
                        }
                    }
                }
            }
        }

        int mostPoints = 0;
        String personMostPoints = "";
        for (Map.Entry<String, HashMap<String, Integer>> entry : contestants.entrySet()) {
            int sum = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();
            if (sum > mostPoints) {
                mostPoints = sum;
                personMostPoints = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.\nRanking: \n", personMostPoints, mostPoints);

        for (Map.Entry<String, HashMap<String, Integer>> entry : contestants.entrySet()) {
            System.out.println(entry.getKey());

            entry.getValue().entrySet().stream()
                    .sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
                    .forEach((current) -> System.out.printf("#  %s -> %d\n", current.getKey(), current.getValue()));

//            List<Map.Entry<String, Integer>> list = new ArrayList<>(entry.getValue().entrySet());
//            list.sort(Map.Entry.comparingByValue());
//            list.forEach((current) -> System.out.printf("# %s -> %d\n", current.getKey(), current.getValue()));
        }
    }
}

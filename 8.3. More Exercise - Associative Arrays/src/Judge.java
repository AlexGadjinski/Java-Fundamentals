import java.util.*;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, TreeMap<String, Integer>> contests = new LinkedHashMap<>();
        TreeMap<String, Integer> contestants = new TreeMap<>();


        while (true) {
            String input = scanner.nextLine();
            if (input.equals("no more time")) {
                break;
            }
            String[] command = input.split(" -> ");
            String name = command[0];
            String contest = command[1];
            int points = Integer.parseInt(command[2]);

            boolean hasMorePoints = false;
            int pointsToRemove = 0;
            boolean hasNotParticipated = false;

            if (!contests.containsKey(contest)) {
                contests.put(contest, new TreeMap<>());
                contests.get(contest).put(name, points);
                hasMorePoints = true;
            } else {
                if (!contests.get(contest).containsKey(name)) {
                    contests.get(contest).put(name, points);
                    hasNotParticipated = true;
                } else {
                    int lastPoints = contests.get(contest).get(name);
                    if (points > lastPoints) {
                        contests.get(contest).put(name, points);
                        hasMorePoints = true;
                        pointsToRemove = lastPoints;
                    }
                }
            }

            if (!contestants.containsKey(name)) {
                contestants.put(name, points);
            } else {
                if (hasNotParticipated) {
                    contestants.put(name, contestants.get(name) + points);
                } else {
                    if (hasMorePoints) {
                        int totalPoints = contestants.get(name) - pointsToRemove + points;
                        contestants.put(name, totalPoints);
                    }
                }
            }
        }

        for (Map.Entry<String, TreeMap<String, Integer>> entry : contests.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size() + " participants");
            int[] counter = {1};

            entry.getValue().entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(current -> System.out.printf("%d. %s <::> %d\n", counter[0]++, current.getKey(), current.getValue()));
        }

        System.out.println("Individual standings:");
        int[] counter = {1};
        contestants.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
                .forEach(entry -> System.out.printf("%d. %s -> %d\n", counter[0]++, entry.getKey(), entry.getValue()));
    }
}

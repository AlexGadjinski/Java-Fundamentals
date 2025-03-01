import java.util.LinkedHashMap;
import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> followers = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Log out")) {
                break;
            }
            String[] command = input.split(": ");
            String username = command[1];

            switch (command[0]) {
                case "New follower":
                    followers.putIfAbsent(username, 0);
                    break;
                case "Like":
                    followers.putIfAbsent(username, 0);
                    int count = Integer.parseInt(command[2]);
                    followers.put(username, followers.get(username) + count);
                    break;
                case "Comment":
                    followers.putIfAbsent(username, 0);
                    followers.put(username, followers.get(username) + 1);
                    break;
                case "Blocked":
                    if (followers.containsKey(username)) {
                        followers.remove(username);
                    } else {
                        System.out.printf("%s doesn't exist.\n", username);
                    }
                    break;
            }
        }
        System.out.println(followers.size() + " followers");
        followers.forEach((key, value) -> System.out.printf("%s: %d\n", key, value));
    }
}

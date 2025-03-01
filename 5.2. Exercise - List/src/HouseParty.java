import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commands = Integer.parseInt(scanner.nextLine());
        List<String> people = new ArrayList<>();

        for (int i = 0; i < commands; i++) {
            String[] input = scanner.nextLine().split(" ");
            switch (input[2]) {
                case "going!":
                    if (!people.contains(input[0])) {
                        people.add(input[0]);
                    } else {
                        System.out.printf("%s is already in the list!\n", input[0]);
                    }
                    break;
                case "not":
                    if (people.contains(input[0])) {
                        people.remove(input[0]);
                    } else {
                        System.out.printf("%s is not in the list!\n", input[0]);
                    }
                    break;
            }
        }
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }
}

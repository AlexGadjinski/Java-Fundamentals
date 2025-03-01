import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Add":
                    int newWagon = Integer.parseInt(command[1]);
                    wagons.add(newWagon);
                    break;
                default:
                    int passengers = Integer.parseInt(command[0]);
                    for (int i = 0; i < wagons.size(); i++) {
                        if (wagons.get(i) + passengers <= capacity) {
                            wagons.set(i, wagons.get(i) + passengers);
                            break;
                        }
                    }
                    break;
            }
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}

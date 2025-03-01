import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(command[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(command[1]);
                    int indexForInsert = Integer.parseInt(command[2]);
                    if (indexForInsert < 0 || indexForInsert > numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.add(indexForInsert, numberToInsert);
                    }
                    break;
                case "Remove":
                    int indexForRemove = Integer.parseInt(command[1]);
                    if (indexForRemove < 0 || indexForRemove >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(indexForRemove);
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(command[2]);
                    switch (command[1]) {
                        case "left":
                            for (int i = 0; i < count; i++) {
                                int current = numbers.get(0);
                                numbers.remove(Integer.valueOf(current));
                                numbers.add(current);
                            }
                            break;
                        case "right":
                            for (int i = 0; i < count; i++) {
                                int current = numbers.get(numbers.size()-1);
                                numbers.remove(numbers.get(numbers.size()-1));
                                numbers.add(0, current);
                            }
                            break;
                    }
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}

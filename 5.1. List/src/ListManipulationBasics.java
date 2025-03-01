import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String[] command = scanner.nextLine().split(" ");
            if (command[0].equals("end")) {
                break;
            }

            switch (command[0]) {
                case "Add":
                    int number = Integer.parseInt(command[1]);
                    input.add(number);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(command[1]);
                    input.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(command[1]);
                    input.remove(index);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(command[1]);
                    int indexToInsert = Integer.parseInt(command[2]);
                    input.add(indexToInsert, numberToInsert);
                    break;
            }
        }
        System.out.println(input.toString().replaceAll("[\\[\\],]", ""));
    }
}

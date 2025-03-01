import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while(true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Delete":
                    int elementToDelete = Integer.parseInt(command[1]);
                    numbers.removeAll(List.of(elementToDelete));
                    break;
                case "Insert":
                    int elementToAdd = Integer.parseInt(command[1]);
                    int position = Integer.parseInt(command[2]);
                    numbers.add(position, elementToAdd);
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}

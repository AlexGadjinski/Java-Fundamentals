import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phones = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] command = input.split(" - ");

            switch (command[0]) {
                case "Add":
                    String phoneToAdd = command[1];
                    if (!phones.contains(phoneToAdd)) {
                        phones.add(phoneToAdd);
                    }
                    break;
                case "Remove":
                    String phoneToRemove = command[1];
                    phones.remove(phoneToRemove);
                    break;
                case "Bonus phone":
                    String oldPhone = command[1].split(":")[0];
                    String newPhone = command[1].split(":")[1];
                    if (phones.contains(oldPhone)) {
                        int index = phones.indexOf(oldPhone);
                        phones.add(index + 1, newPhone);
                    }
                    break;
                case "Last":
                    String phoneToAddLast = command[1];
                    if (phones.contains(phoneToAddLast)) {
                        phones.remove(phoneToAddLast);
                        phones.add(phoneToAddLast);
                    }
                    break;
            }
        }
        System.out.println(String.join(", ", phones));
    }
}

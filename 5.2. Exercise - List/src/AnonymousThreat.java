import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("3:1")) {
                break;
            }
            String[] command = input.split(" ");
            int startIndex = Integer.parseInt(command[1]);
            int endIndex = Integer.parseInt(command[2]);
            switch (command[0]) {
                case "merge":
                    if (startIndex < endIndex
                            && startIndex < stringList.size() - 1
                            && endIndex > 0) {
                        merge(startIndex, endIndex, stringList);
                    }
                    break;
                case "divide":
                    if (endIndex >= 2 && endIndex <= stringList.get(startIndex).length()) {
                        divide(startIndex, endIndex, stringList);
                    }
                    break;
            }
        }
        System.out.println(String.join(" ", stringList));
    }

    public static void merge (int start, int end, List<String> list) {
        if (start < 0) {
            start = 0;
        }
        if (end > list.size() - 1) {
            end = list.size() - 1;
        }
        for (int i = start; i < end; i++) {
            String stringToMerge = list.get(start + 1);
            list.remove(start + 1);
            list.set(start, list.get(start) + stringToMerge);
        }
    }

    public static void divide (int index, int partitions, List<String> list) {
        List<String> dividedList = new ArrayList<>();

        String stringToDivide = list.get(index);
        int wholeLength = stringToDivide.length();
        int normalLength = wholeLength / partitions;
        int restLength = 0;
        boolean isDivisible = true;
        if (wholeLength % partitions != 0) {
            isDivisible = false;
            restLength = wholeLength - (normalLength * (partitions - 1));
        }
        if (isDivisible) {
            for (int i = 0; i < partitions; i++) {
                String stringToAdd = stringToDivide.substring(0, normalLength);
                stringToDivide = stringToDivide.substring(normalLength);
                dividedList.add(stringToAdd);
            }
        }
        else {
            String rest = stringToDivide.substring(wholeLength - restLength);
            stringToDivide = stringToDivide.substring(0, wholeLength - restLength);
            for (int i = 1; i < partitions; i++) {
                String stringToAdd = stringToDivide.substring(0, normalLength);
                stringToDivide = stringToDivide.substring(normalLength);
                dividedList.add(stringToAdd);
            }
            dividedList.add(rest);
        }
        list.remove(index);
        list.addAll(index, dividedList);
    }
}

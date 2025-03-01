import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
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
                case "Contains":
                    int number = Integer.parseInt(command[1]);
                    if (input.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (command[1].equals("even")) {
                        for (Integer num : input) {
                            if (num % 2 == 0) {
                                System.out.print(num + " ");
                            }
                        }
                    } else if (command[1].equals("odd")) {
                        for (Integer num : input) {
                            if (num % 2 != 0) {
                                System.out.print(num + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    if (command[1].equals("sum")) {
                        int sum = 0;
                        for (Integer num : input) {
                            sum += num;
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    int numberToFilter = Integer.parseInt(command[2]);
                    switch (command[1]) {
                        case "<":
                            for (Integer num : input) {
                                if (num < numberToFilter) {
                                    System.out.print(num + " ");
                                }
                            }
                            break;
                        case ">":
                            for (Integer num : input) {
                                if (num > numberToFilter) {
                                    System.out.print(num + " ");
                                }
                            }
                            break;
                        case ">=":
                            for (Integer num : input) {
                                if (num >= numberToFilter) {
                                    System.out.print(num + " ");
                                }
                            }
                            break;
                        case "<=":
                            for (Integer num : input) {
                                if (num <= numberToFilter) {
                                    System.out.print(num + " ");
                                }
                            }
                            break;
                    }
                    System.out.println();
                    break;
            }
        }
    }
}

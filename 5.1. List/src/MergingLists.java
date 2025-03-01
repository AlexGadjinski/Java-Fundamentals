import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input1 = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> input2 = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> result = new ArrayList<>();

        int minSize = Math.min(input1.size(), input2.size());

        for (int i = 0; i < minSize; i++) {
            result.add(input1.get(i));
            result.add(input2.get(i));
        }

        if (input1.size() > input2.size()) {
            List<String> sublist = input1.subList(minSize, input1.size());
            result.addAll(sublist);
        } else if (input2.size() > input1.size()) {
            List<String> sublist = input2.subList(minSize, input2.size());
            result.addAll(sublist);
        }

        System.out.println(String.join(" ", result));
        //System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listResult = new ArrayList<>();

        int end;
        int constraint1;
        int constraint2;
        if (list1.size() > list2.size()) {
            int num1 = list1.get(list1.size() - 1);
            int num2 = list1.get(list1.size() - 2);
            end = list2.size();
            constraint1 = Math.min(num1, num2);
            constraint2 = Math.max(num1, num2);
        } else {
            int num1 = list2.get(1);
            int num2 = list2.get(0);
            constraint1 = Math.min(num1, num2);
            constraint2 = Math.max(num1, num2);
            end = list1.size();
        }

        int indexForSecondList = list2.size() - 1;
        for (int i = 0; i < end; i++) {
            listResult.add(list1.get(i));
            listResult.add(list2.get(indexForSecondList));
            indexForSecondList--;
        }
        listResult.removeIf(num -> num <= constraint1 || num >= constraint2);
        Collections.sort(listResult);
        System.out.println(listResult.toString().replaceAll("[\\[\\],]", ""));
    }
}

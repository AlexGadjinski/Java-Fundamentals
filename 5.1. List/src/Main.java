import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(13);
        numbers.remove(1);
        numbers.remove(Integer.valueOf(1));
        System.out.println(numbers);

        List<String> words = new ArrayList<>();
        words.add("simo");
        words.add("kfc");
        words.add("opa");

        words.remove("simo");


        List<String> wordList = new ArrayList<>(Arrays.asList("ew", "29dj"));
        List<Integer> numberList = new ArrayList<>(Arrays.asList(31, 1, 2, 4, 31, 31, 31));

        numberList.remove(Integer.valueOf(31));
        numberList.removeAll(Arrays.asList(31));

        //List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        //List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }
}

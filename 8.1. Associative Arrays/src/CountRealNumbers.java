import java.text.DecimalFormat;
import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double, Integer> map = new TreeMap<>();

        for (double num : input) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
        }
        DecimalFormat df = new DecimalFormat("0.##");
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.println(df.format(entry.getKey()) + " -> " + entry.getValue());
        }
    }
}

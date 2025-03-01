import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Simo", 20);
        map.remove("Simo");
        if (map.containsKey("Simo")) {

        }
        if (map.containsValue(10)) {

        }

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue());
        }
    }
}

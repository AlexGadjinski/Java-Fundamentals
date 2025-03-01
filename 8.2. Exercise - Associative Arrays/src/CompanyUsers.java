import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] command = input.split(" -> ");
            String company = command[0];
            String employee = command[1];

            map.putIfAbsent(company, new ArrayList<>());
            if (!map.get(company).contains(employee)) {
                map.get(company).add(employee);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employee -> System.out.println("-- " + employee));
//            for (String s : entry.getValue()) {
//                System.out.println("-- " + s);
//            }
        }
    }
}

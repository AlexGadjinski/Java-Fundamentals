import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!map.containsKey(name)) {
                map.put(name, new ArrayList<>());
            }
            map.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            double grades = 0;
            double size = entry.getValue().size();

            for (double grade : entry.getValue()) {
                grades += grade;
            }
            double averageGrade = grades / size;
            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.2f\n", entry.getKey(), averageGrade);
            }
        }
    }
}

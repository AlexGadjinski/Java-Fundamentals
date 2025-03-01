import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] command = input.split(" : ");
            String course = command[0];
            String student = command[1];

            if (!courses.containsKey(course)) {
                courses.put(course, new ArrayList<>());
            }
            courses.get(course).add(student);
        }
        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            for (String student : entry.getValue()) {
                System.out.println("-- " + student);
            }
        }
    }
}

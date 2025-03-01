import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    String firstName;
    String lastName;
    double grade;
    public Students(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> studentsList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            Students student = new Students(command[0], command[1], Double.parseDouble(command[2]));
            studentsList.add(student);
        }
        for (int i = 0; i < studentsList.size();) {
            int index = 0;
            double maxGrade = 0;
            for (int j = 0; j < studentsList.size(); j++) {
                if (studentsList.get(j).grade > maxGrade) {
                    maxGrade = studentsList.get(j).grade;
                    index = j;
                }
            }
            System.out.printf("%s %s: %.2f\n", studentsList.get(index).firstName,
                    studentsList.get(index).lastName, studentsList.get(index).grade);
            studentsList.remove(index);
        }
    }
}

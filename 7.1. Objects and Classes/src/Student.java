import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    Student(String firstName,  String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getHometown() {
        return hometown;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");

            String firstName = command[0];
            String lastName = command[1];
            int age = Integer.parseInt(command[2]);
            String hometown = command[3];

            Student newStudent = new Student(firstName, lastName, age, hometown);
            students.add(newStudent);

            for (int i = 0; i < students.size() - 1; i++) {
                Student current = students.get(i);
                if (current.getFirstName().equals(firstName)
                        && current.getLastName().equals(lastName)) {
                    current.setAge(age);
                    current.setHometown(hometown);
                    students.remove(students.size() - 1);
                }
            }
            input = scanner.nextLine();
        }
        String town = scanner.nextLine();
        for (Student student : students) {
            if (student.getHometown().equals(town)) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + " is "
                + student.getAge() + " years old");
            }
        }
    }
}

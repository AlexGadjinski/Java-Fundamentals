package CompanyRoster;

public class Employee {
    String name;
    double salary;
    String position;
    String department;
    String email;
    int age;
    Employee(String name, String salary, String position, String department) {
        this.name = name;
        this.salary = Double.parseDouble(salary);
        this.position = position;
        this.department = department;
        email = "n/a";
        age = -1;
    }
    Employee(String name, String salary, String position, String department, String emailOrAge) {
        this.name = name;
        this.salary = Double.parseDouble(salary);
        this.position = position;
        this.department = department;
        if (emailOrAge.contains("@")) {
           email = emailOrAge;
           age = -1;
        } else {
            email = "n/a";
            age = Integer.parseInt(emailOrAge);
        }
    }
    Employee(String name, String salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = Double.parseDouble(salary);
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }
}

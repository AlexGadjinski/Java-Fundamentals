package CompanyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Department> departmentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (command.length == 4) {
                Employee current = new Employee(command[0], command[1], command[2], command[3]);
                addEmployeeToDepartment(departmentList, current, command[3]);
            } else if (command.length == 6) {
                Employee current = new Employee(command[0], command[1], command[2], command[3],
                        command[4], Integer.parseInt(command[5]));
                addEmployeeToDepartment(departmentList, current, command[3]);
            } else {
                Employee current = new Employee(command[0], command[1], command[2], command[3], command[4]);
                addEmployeeToDepartment(departmentList, current, command[3]);
            }
        }
        Department bestDepartment = departmentList.get(0);
        double highestAverageSalary = bestDepartment.averageSalaryInDepartment();

        for (int i = 1; i < departmentList.size(); i++) {
            double averageSalary = departmentList.get(i).averageSalaryInDepartment();
            if (averageSalary > highestAverageSalary) {
                highestAverageSalary = averageSalary;
                bestDepartment = departmentList.get(i);
            }
        }
        System.out.println("Highest Average Salary: " + bestDepartment.department);
        for (Employee employee: bestDepartment.salaryInDescendingOrder()) {
            System.out.printf("%s %.2f %s %d\n", employee.name, employee.salary, employee.email, employee.age);
        }
    }

    public static void addEmployeeToDepartment(List<Department> departmentList, Employee employee, String department) {
        if (departmentList.isEmpty()) {
            Department newDepartment = new Department(department);
            departmentList.add(newDepartment);
            newDepartment.addEmployee(employee);
        } else {
            for (int j = 0; j < departmentList.size(); j++) {
                if (department.equals(departmentList.get(j).department)) {
                    departmentList.get(j).addEmployee(employee);
                    return;
                }
            }
            Department newDepartment = new Department(department);
            departmentList.add(newDepartment);
            newDepartment.addEmployee(employee);
        }
    }
}

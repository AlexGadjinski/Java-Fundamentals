package CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    List<Employee> employeeList;
    String department;

    Department(String department) {
        this.department = department;
        employeeList = new ArrayList<>();
    }

    void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    double averageSalaryInDepartment() {
        double salary = 0;

        for (int i = 0; i < employeeList.size(); i++) {
            salary += employeeList.get(i).salary;
        }
        return salary / employeeList.size();
    }

    List<Employee> salaryInDescendingOrder() {
        List<Employee> sortedList = new ArrayList<>();
        for (int i = 0; i < employeeList.size();) {
            double highestSalary = employeeList.get(0).salary;
            Employee highestSalaryEmployee = employeeList.get(0);
            for (Employee employee: employeeList) {
                if (employee.salary > highestSalary) {
                    highestSalary = employee.salary;
                    highestSalaryEmployee = employee;
                }
            }
            sortedList.add(highestSalaryEmployee);
            employeeList.remove(highestSalaryEmployee);
        }
        return sortedList;
    }
}

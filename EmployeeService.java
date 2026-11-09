
import java.util.ArrayList;

public class EmployeeService {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully!");
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

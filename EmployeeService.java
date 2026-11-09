
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

    // NEW: Salary increment functionality
    public void incrementSalary(int id, double percentage) {

        if (percentage < 0 || !Double.isFinite(percentage)) {
            System.out.println("Invalid increment percentage!");
            return;
        }

        for (Employee employee : employees) {

            if (employee.getId() == id) {

                double oldSalary = employee.getSalary();

                double incrementAmount =
                        oldSalary * (percentage / 100);

                double newSalary =
                        oldSalary + incrementAmount;

                if (!Double.isFinite(newSalary)) {
                    System.out.println("Invalid calculated salary!");
                    return;
                }

                employee.setSalary(newSalary);

                System.out.println("Employee Found: "
                        + employee.getName());

                System.out.println("Old Salary: " + oldSalary);
                System.out.println("Increment: " + percentage + "%");
                System.out.println("New Salary: " + newSalary);
                System.out.println("Salary updated successfully!");

                return;
            }
        }

        System.out.println("Employee not found!");
    }
}

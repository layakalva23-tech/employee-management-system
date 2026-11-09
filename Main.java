
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);

        service.addEmployee(emp);
        service.viewEmployees();

        // NEW: Salary increment feature

        System.out.println("\n--- Employee Salary Increment ---");

        System.out.print("Enter Employee ID to update salary: ");
        int searchId = sc.nextInt();

        System.out.print("Enter Increment Percentage: ");
        double percentage = sc.nextDouble();

        service.incrementSalary(searchId, percentage);

        System.out.println("\n--- Updated Employee Details ---");
        service.viewEmployees();

        sc.close();
    }
}

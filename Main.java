
public class Main {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        Employee emp1 = new Employee(101, "John", 50000);
        Employee emp2 = new Employee(102, "Sara", 60000);

        service.addEmployee(emp1);
        service.addEmployee(emp2);

        System.out.println("Employee List:");
        service.viewEmployees();
    }
}

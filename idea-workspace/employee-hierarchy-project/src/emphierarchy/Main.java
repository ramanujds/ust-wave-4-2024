package emphierarchy;

import emphierarchy.model.Developer;
import emphierarchy.model.Employee;
import emphierarchy.service.EmployeeOperation;
import emphierarchy.service.EmployeeOperationImpl;

public class Main {
    public static void main(String[] args) {
        EmployeeOperation employeeOperation = new EmployeeOperationImpl();

        // Create some employee object and add them

        Employee emp1 = new Developer(1,"Vivek",54000,"Java");
        Employee emp2 = new Developer(2,"Andrea",54000,"Python");

        employeeOperation.addEmployee(emp1);
        employeeOperation.addEmployee(emp2);

        // Find an employee with id
//        int id = 1;
//        Employee emp = employeeOperation.findEmployeeById(id);

        // Display all the employees

        employeeOperation.showAllEmployees();

        // Task to do later
        // Ask user to select an option
        // 1 - To add new Employee

    }
}
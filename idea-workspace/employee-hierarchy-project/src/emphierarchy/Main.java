package emphierarchy;

import emphierarchy.exception.InvalidInputException;
import emphierarchy.model.Developer;
import emphierarchy.model.Employee;
import emphierarchy.service.EmployeeOperation;
import emphierarchy.service.EmployeeOperationCollectionBasedImpl;
import emphierarchy.service.EmployeeOperationImpl;

public class Main {



    public static void main(String[] args) {
        EmployeeOperation employeeOperation = new EmployeeOperationCollectionBasedImpl();


        // Create some employee object and add them

        Employee emp1 = new Developer(1,"Vivek",54000,"Java");
        Employee emp2 = new Developer(2,"Andrea",54000,"Python");

        try {
            employeeOperation.addEmployee(emp1);
            employeeOperation.addEmployee(emp2);
        }
        catch (InvalidInputException ex){
            ex.printStackTrace();
        }

        // Find an employee with id
//        int id = 10;
//        Employee emp = employeeOperation.findEmployeeById(id);
//        System.out.println(emp);

        // Display all the employees

        employeeOperation.showAllEmployees();

        employeeOperation.removeEmployee(1);

        employeeOperation.showAllEmployees();

        // Task to do later
        // Ask user to select an option
        // 1 - To add new Employee

    }
}
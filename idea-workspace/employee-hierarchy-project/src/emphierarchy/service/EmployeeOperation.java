package emphierarchy.service;

import emphierarchy.exception.InvalidInputException;
import emphierarchy.model.Employee;

public interface EmployeeOperation {

    // Throw exception with proper message for the following conditions
    // Id should be a positive value
    // Name must not be empty
    // Salary should be a positive value
    void addEmployee(Employee employee) throws InvalidInputException;

    void showAllEmployees();

    Employee findEmployeeById(int id);

    void removeEmployee(int id);

}

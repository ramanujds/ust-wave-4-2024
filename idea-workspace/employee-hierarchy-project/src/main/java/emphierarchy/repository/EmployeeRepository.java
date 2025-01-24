package emphierarchy.repository;

import emphierarchy.exception.InvalidInputException;
import emphierarchy.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee findEmployeeById(int id);

    void removeEmployee(int id);

    Employee findEmployeeByName(String name);
}

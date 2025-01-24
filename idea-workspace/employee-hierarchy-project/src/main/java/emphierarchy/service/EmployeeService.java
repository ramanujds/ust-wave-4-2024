package emphierarchy.service;

import emphierarchy.exception.InvalidInputException;
import emphierarchy.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> findAllEmployees();

    Employee findEmployeeById(int id);

    void removeEmployee(int id);

    Employee findEmployeeByName(String name);

}

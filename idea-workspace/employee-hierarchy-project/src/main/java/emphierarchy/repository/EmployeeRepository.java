package emphierarchy.repository;

import emphierarchy.exception.InvalidInputException;
import emphierarchy.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeRepository {
    Employee addEmployee(Employee employee) throws SQLException;

    List<Employee> getAllEmployees() throws SQLException;

    Employee findEmployeeById(int id) throws SQLException;

    void removeEmployee(int id);

    Employee findEmployeeByName(String name);
}

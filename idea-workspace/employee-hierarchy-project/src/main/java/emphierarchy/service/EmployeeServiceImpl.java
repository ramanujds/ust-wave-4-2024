package emphierarchy.service;

import emphierarchy.exception.InvalidInputException;
import emphierarchy.model.Employee;
import emphierarchy.repository.EmployeeRepository;
import emphierarchy.repository.EmployeeRepositoryImpl;
import emphierarchy.repository.EmployeeRepositoryJdbcImpl;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository empRepo = new EmployeeRepositoryJdbcImpl();

    public void setEmpRepo(EmployeeRepository empRepo) {
        this.empRepo = empRepo;
    }

    public Employee addEmployee(Employee employee) {
        try {
            return empRepo.addEmployee(employee);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public List<Employee> findAllEmployees() {
        try {
            return empRepo.getAllEmployees();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Employee findEmployeeById(int id) {
        try {
            return empRepo.findEmployeeById(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void removeEmployee(int id) {
        empRepo.removeEmployee(id);
    }

    public Employee findEmployeeByName(String name) {
        return empRepo.findEmployeeByName(name);
    }
}

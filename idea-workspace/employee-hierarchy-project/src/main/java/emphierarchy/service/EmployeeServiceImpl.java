package emphierarchy.service;

import emphierarchy.exception.InvalidInputException;
import emphierarchy.model.Employee;
import emphierarchy.repository.EmployeeRepository;
import emphierarchy.repository.EmployeeRepositoryImpl;
import emphierarchy.repository.EmployeeRepositoryJdbcImpl;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository empRepo = new EmployeeRepositoryJdbcImpl();

    public void setEmpRepo(EmployeeRepository empRepo) {
        this.empRepo = empRepo;
    }

    public Employee addEmployee(Employee employee) {
       return empRepo.addEmployee(employee);
    }

    public List<Employee> findAllEmployees() {
        return empRepo.getAllEmployees();
    }

    public Employee findEmployeeById(int id) {
        return empRepo.findEmployeeById(id);
    }

    public void removeEmployee(int id) {
        empRepo.removeEmployee(id);
    }

    public Employee findEmployeeByName(String name) {
        return empRepo.findEmployeeByName(name);
    }
}

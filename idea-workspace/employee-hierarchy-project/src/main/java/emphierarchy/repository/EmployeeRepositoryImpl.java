package emphierarchy.repository;

import emphierarchy.exception.InvalidInputException;
import emphierarchy.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private List<Employee> employeeDb = new ArrayList<>();


    public Employee addEmployee(Employee employee)  {

        return null;
    }

    public List<Employee> getAllEmployees() {
        return employeeDb;
    }

    public Employee findEmployeeById(int id) {
        for (Employee emp:employeeDb){
            if (emp.getId()==id){
                return emp;
            }
        }
        return null;
    }

    public void removeEmployee(int id) {

    }

    public Employee findEmployeeByName(String name) {
        return null;
    }
}

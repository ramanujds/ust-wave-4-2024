package emphierarchy.service;

import emphierarchy.exception.InvalidInputException;
import emphierarchy.exception.RecordNotFoundException;
import emphierarchy.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOperationCollectionBasedImpl implements EmployeeOperation{

    private List<Employee> employees = new ArrayList<>();


    public void addEmployee(Employee employee) throws InvalidInputException {
        if(employee.getId()<=0){
            throw new InvalidInputException("ID must be a positive number");
        }
        if(employee.getName().isBlank()){
            throw new InvalidInputException("Name should not be empty");
        }
        if(employee.getSalary()<=0){
            throw new InvalidInputException("Salary must be a positive value");
        }
        employees.add(employee);
        System.out.println("Employee Added : "+employee.getName());
    }

    public void showAllEmployees() {
        for (Employee emp:employees){
            emp.showDetails();
        }
    }


    public Employee findEmployeeById(int id) {
        for (Employee emp:employees){
            if (emp.getId()==id){
                return emp;
            }
        }
        throw new RecordNotFoundException("No employee found with id : "+id);
    }

    @Override
    public void removeEmployee(int id) {
        Employee emp = findEmployeeById(id);
        employees.remove(emp);
        System.out.println("Employee : "+emp.getName()+ " Removed");
    }
}

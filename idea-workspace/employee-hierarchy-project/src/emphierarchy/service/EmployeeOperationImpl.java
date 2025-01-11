package emphierarchy.service;

import emphierarchy.exception.InvalidInputException;
import emphierarchy.model.Employee;

public class EmployeeOperationImpl implements EmployeeOperation{

    private Employee[] employees = new Employee[5];
    int count=-1;

    // Id should be a positive value
    // Name must not be empty
    // Salary should be a positive value

    public void addEmployee(Employee employee) {
        if(employee.getId()<=0){
            throw new InvalidInputException("ID must be a positive number");
        }
        if(employee.getName().isBlank()){
            throw new InvalidInputException("Name should not be empty");
        }
        if(employee.getSalary()<=0){
            throw new InvalidInputException("Salary must be a positive value");
        }
        employees[++count] = employee;
        System.out.println("Employee Added : "+employee.getName());
    }

    public void showAllEmployees() {
        for (Employee emp:employees){
            if (emp == null) {
                System.out.println("All Printed");
                break;
            }
            emp.showDetails();
        }
    }


    // RecordNotFoundException
    // Should be thrown when no employee is present for a given id

    public Employee findEmployeeById(int id) {

        for (int i = 0; i < 10; i++) {
            if (employees[i] !=null && employees[i].getId()==id){
                return employees[i];
            }
        }
        return null;
    }
}

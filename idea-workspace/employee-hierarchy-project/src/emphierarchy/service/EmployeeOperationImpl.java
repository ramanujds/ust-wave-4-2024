package emphierarchy.service;

import emphierarchy.model.Employee;

public class EmployeeOperationImpl implements EmployeeOperation{

    private Employee[] employees = new Employee[5];
    int count=-1;

    public void addEmployee(Employee employee) {
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

    public Employee findEmployeeById(int id) {

        for (int i = 0; i < 10; i++) {
            if (employees[i] !=null && employees[i].getId()==id){
                return employees[i];
            }
        }
        return null;
    }
}

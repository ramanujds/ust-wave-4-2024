package emphierarchy.service;

import emphierarchy.model.Employee;

public interface EmployeeOperation {

    void addEmployee(Employee employee);

    void showAllEmployees();

    Employee findEmployeeById(int id);

}

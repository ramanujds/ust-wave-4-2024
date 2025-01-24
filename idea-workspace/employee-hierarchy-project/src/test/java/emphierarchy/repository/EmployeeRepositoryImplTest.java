package emphierarchy.repository;

import emphierarchy.model.Developer;
import emphierarchy.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRepositoryImplTest {

    EmployeeRepositoryImpl employeeRepo;

    @BeforeEach
    void seUp(){
        employeeRepo = new EmployeeRepositoryImpl();
    }

    @Test
    void addEmployeeTest() {
        // Given
        Employee emp = new Developer(1,"Sachin",60000,"Python");
        // When
        employeeRepo.addEmployee(emp);
        // Then
        Assertions.assertNotNull(employeeRepo.findEmployeeById(emp.getId()));

    }

    @Test
    void getAllEmployeesTest() {
        // Given
        var emp1 = new Developer(1,"Sachin",60000,"Python");
        var emp2 = new Developer(2,"Vivek",60000,"Java");
        employeeRepo.addEmployee(emp1);
        employeeRepo.addEmployee(emp2);

        // When
        var empList = employeeRepo.getAllEmployees();

        // Then
        Assertions.assertEquals(2,empList.size());

    }

    @Test
    void findEmployeeByIdTest() {
    }

    @Test
    void removeEmployeeTest() {
    }

    @Test
    void findEmployeeByNameTest() {
    }
}
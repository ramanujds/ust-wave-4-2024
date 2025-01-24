package emphierarchy.service;

import emphierarchy.model.Developer;
import emphierarchy.model.Employee;
import emphierarchy.repository.EmployeeRepository;
import emphierarchy.repository.EmployeeRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Mock
    private EmployeeRepositoryImpl employeeRepository;


    @Test
    void addEmployee() {

        // Given
        Employee emp = new Developer(1,"Sachin",60000,"Python");

        // When
        Mockito.when(employeeRepository.addEmployee(emp)).thenReturn(emp);

        // Then
        assertEquals(emp,employeeService.addEmployee(emp));

        // Verify that the method is called only once
        Mockito.verify(employeeRepository,Mockito.times(1)).addEmployee(emp);


    }

    @Test
    void findAllEmployees() {
    }

    @Test
    void findEmployeeById() {
    }

    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployeeByName() {
    }
}
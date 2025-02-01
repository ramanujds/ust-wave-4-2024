package emphierarchy;

import emphierarchy.exception.InvalidInputException;

import emphierarchy.model.Employee;
import emphierarchy.service.EmployeeService;
import emphierarchy.service.EmployeeServiceImpl;

import java.time.LocalDate;


public class Main {



    public static void main(String[] args) {

//        Employee employee = new Employee(0,"Sai Karthik",42000,"Hyderabad",
//                LocalDate.of(2024,10,10));

        EmployeeService employeeService = new EmployeeServiceImpl();
        var employee = employeeService.findEmployeeById(5);
        System.out.println(employee);



    }
}
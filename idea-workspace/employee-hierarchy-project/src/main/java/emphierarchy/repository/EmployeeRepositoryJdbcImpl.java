package emphierarchy.repository;

import emphierarchy.model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryJdbcImpl implements EmployeeRepository {


    Connection connection;
    PreparedStatement psmt;

    String url = "jdbc:mysql://localhost:3306/ust_wave_4";
    String username = "root";
    String password = "password";

    public EmployeeRepositoryJdbcImpl() {
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }


    public Employee addEmployee(Employee employee) throws SQLException {

//        psmt = connection.prepareStatement("""
//                insert into employee(name,salary,joined_date,location)
//                values ('%s',%f,'%s','%s')
//                """.formatted(employee.getName(), employee.getSalary(), employee.getJoinedDate().toString(), employee.getLocation()));


        psmt = connection.prepareStatement("""
                insert into employee(name,salary,joined_date,location)
                values (?,?,?,?)
                """);
        psmt.setString(1, employee.getName());
        psmt.setDouble(2, employee.getSalary());
        psmt.setString(3, employee.getJoinedDate().toString());
        psmt.setString(4, employee.getLocation());

        psmt.executeUpdate();

        return employee;
    }

    public List<Employee> getAllEmployees() throws SQLException {

        psmt = connection.prepareStatement("select * from employee");
        ResultSet rs = psmt.executeQuery();
        List<Employee> list = new ArrayList<>();
        while (rs.next()) {
            var emp = getEmployeeFromResultSet(rs);
            list.add(emp);
        }

        return list;

    }

    public Employee findEmployeeById(int id) throws SQLException {

        psmt = connection.prepareStatement("select * from employee where id=?");
        psmt.setInt(1, id);
        ResultSet rs = psmt.executeQuery();
        if (rs.next()) {
            return getEmployeeFromResultSet(rs);
        }

        return null;
    }

    public void removeEmployee(int id) {

    }

    public Employee findEmployeeByName(String name) {
        return null;
    }

    private Employee getEmployeeFromResultSet(ResultSet rs) throws SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setName(rs.getString("name"));
        employee.setSalary(rs.getDouble("salary"));
        employee.setJoinedDate(rs.getDate("joined_date").toLocalDate());
        employee.setLocation(rs.getString("location"));
        return employee;
    }

}

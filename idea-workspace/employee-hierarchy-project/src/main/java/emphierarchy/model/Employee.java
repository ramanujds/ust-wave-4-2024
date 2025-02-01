package emphierarchy.model;

import java.time.LocalDate;
import java.util.StringJoiner;

public class Employee {

    // add private fields for id, name and salary

    private int id;
    private String name;
    private double salary;
    private String location;
    private LocalDate joinedDate;

    public Employee(){}

    public Employee(int id, String name, double salary, String location, LocalDate joinedDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.location = location;
        this.joinedDate = joinedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(LocalDate joinedDate) {
        this.joinedDate = joinedDate;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("salary=" + salary)
                .add("location='" + location + "'")
                .add("joinedDate=" + joinedDate)
                .toString();
    }
}

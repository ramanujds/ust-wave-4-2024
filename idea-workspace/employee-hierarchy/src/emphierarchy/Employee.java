package emphierarchy;

public class Employee {
    protected int id;
    protected String name;
    protected double salary;


    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void printDetails(){
        System.out.println("Employee Profile : "+this.getClass().getSimpleName());
        System.out.printf("""
                ID : %d
                Name : %s
                Salary : %.2f
                """,id,name,salary);
    }

}

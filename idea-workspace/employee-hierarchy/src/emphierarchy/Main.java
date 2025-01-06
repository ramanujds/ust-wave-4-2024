package emphierarchy;

public class Main {
    public static void main(String[] args) {

        Employee emp;

        emp = new BackendDeveloper(101, "Akash", 65000, "Java", "MySQL");

        emp.printDetails();

        emp = new Manager(101, "Akash", 80000, 8);

    }
}
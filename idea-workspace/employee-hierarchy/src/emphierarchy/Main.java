package emphierarchy;

public class Main {
    public static void main(String[] args) {

        Employee emp;

        emp = new BackendDeveloper(101, "Akash", 65000, "Java", "MySQL");

        emp.doWork();

        emp = new Manager(101, "Akash", 80000, 8);

        emp.doWork();

    }
}
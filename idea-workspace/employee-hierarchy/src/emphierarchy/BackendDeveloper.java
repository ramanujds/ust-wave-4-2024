package emphierarchy;

public class BackendDeveloper extends Developer{
    private String database;

    public BackendDeveloper(int id, String name, double salary, String language, String database) {
        super(id, name, salary,language);
        this.database=database;
    }



    public void printDetails() {
        super.printDetails();
        System.out.println("Database : "+database);
    }

    public void doWork() {
        System.out.println("Working on Code and Database");
    }


}

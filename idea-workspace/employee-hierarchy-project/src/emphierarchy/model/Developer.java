package emphierarchy.model;

public class Developer extends Employee{

    private String language;



    public Developer(int id, String name, double salary, String language) {
        super(id, name, salary);
        this.language=language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void showDetails() {
        System.out.println("Developer Details : ");
        System.out.printf("""
                ID : %d
                Name : %s
                Salary : %.2f
                Language : %s
                """,getId(),getName(),getSalary(),language);
    }

    // extends the Employee class
    // add a new field language

}

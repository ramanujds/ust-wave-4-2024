package emphierarchy;

public class Developer extends Employee{
    private String language;

    public Developer(int id, String name, double salary, String language) {
        super(id, name, salary);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Programming Language : "+language);
    }
}

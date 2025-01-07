package emphierarchy;

public class Manager extends Employee implements Payable, Taxable{
    private int teamSize;

    public Manager(int id, String name, double salary, int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Team Size : "+teamSize);
    }


    public void doWork() {
        System.out.println("Managing work");
    }

    public void getSalary() {

    }

    public void payTaxes(){

    }
}

package emphierarchy;

public class Manager extends Employee{
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
}

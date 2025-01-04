package oopbasics;

public class Trainee{
    private int id;
    private String name;
    static String company;
    // private Company company;
    private String language;

    public Trainee(){
        System.out.println("Trainee object created");
    }

    public Trainee(int id, String name, String language) {
        this.id = id;
        this.name = name;
        this.language = language;
    }
    public Trainee(int id, String name) {
        this.id = id;
        this.name = name;
        this.language="Java";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id<=0){
            System.err.println("Invalid value for ID");
            System.exit(1);
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}


package model;

import java.util.StringJoiner;

public class Trainee  {

    private int id;
    private String name;
    private String language;

    public Trainee(int id, String name, String language) {
        this.id = id;
        this.name = name;
        this.language = language;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Trainee.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("language='" + language + "'")
                .toString();
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trainee trainee)) return false;

        return id == trainee.id && name.equals(trainee.name) && language.equals(trainee.language);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + language.hashCode();
        return result;
    }


//    public int compareTo(Trainee trainee) {
//        // this.id > trainee.id return a positive value
//        int diff = this.language.compareTo(trainee.language);
//        return diff==0?this.id-trainee.id:diff;
//    }
}

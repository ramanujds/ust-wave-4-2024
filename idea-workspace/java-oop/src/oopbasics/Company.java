package oopbasics;

import java.util.StringJoiner;

public class Company {

    private String name;
    private String location;
    private String type;

    public Company(String name, String location, String type) {
        this.name = name;
        this.location = location;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String toString() {
        return new StringJoiner(", ", Company.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("location='" + location + "'")
                .add("type='" + type + "'")
                .toString();
    }
}

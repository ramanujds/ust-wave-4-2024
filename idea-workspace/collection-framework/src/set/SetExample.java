package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<String> trainees = new TreeSet<>();
        trainees.add("Rahul");
        trainees.add("Karan");
        trainees.add("Harsh");
        trainees.add("Rohit");
        trainees.add("Karan");
        trainees.add("Harsh");
        trainees.add("Rohit");
        trainees.add("Karan");
        trainees.add("Harsh");
        trainees.add("Rohit");

        System.out.println(trainees);

    }

}

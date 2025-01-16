package set;

import model.Trainee;

import java.util.*;

class TraineeComparator implements Comparator<Trainee>{
    public int compare(Trainee t1, Trainee t2) {
        return t1.getId()-t2.getId();
    }
}
class TraineeComparatorByName implements Comparator<Trainee>{
    public int compare(Trainee t1, Trainee t2) {
        return t1.getName().compareTo(t2.getName());
    }
}

public class SetOnTraineesExamples {




    public static void main(String[] args) {


        Comparator<Trainee> compareById = new TraineeComparator();
        Comparator<Trainee> compareByName = new TraineeComparatorByName();

        Set<Trainee> trainees = new TreeSet<>(compareById);

        Trainee t1 = new Trainee(4,"Akash","Python");
        Trainee t2 = new Trainee(2, "Gagan","Java");
        Trainee t3 = new Trainee(3,"Sachin","Python");
        Trainee t4 = new Trainee(1,"Vivek","Node JS");

        trainees.add(t1);
        trainees.add(t2);
        trainees.add(t3);
        trainees.add(t4);


        for (Trainee t:trainees){
            System.out.println(t);
        }





    }

}

package oopbasics;


public class ObjectAndClassesDemo {

    public static void main(String[] args) {
        Trainee.company = "UST Global";
        Trainee trainee1 = new Trainee(1,"Vishnu", "Java");
        printTrainee(trainee1);

    }

    public static void printTrainee(Trainee trainee){
        System.out.printf("""
                ID : %d
                Name : %s
                Company : %s
                Language : %s
                %n""", trainee.getId(),
                trainee.getName(),Trainee.company,trainee.getLanguage());
    }

}

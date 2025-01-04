package oopbasics;


public class ObjectAndClassesDemo {

    public static void main(String[] args) {

        Company c1 = new Company("UST Global","Trivandrum","IT Consulting");
        Company c2 = new Company("Deloitte","Bangalore","Auditing");

        Trainee trainee1 = new Trainee(1,"Vishnu", "Java");
        trainee1.setCompany(c2);
        printTrainee(trainee1);

    }

    public static void printTrainee(Trainee trainee){
        System.out.printf("""
                ID : %d
                Name : %s
                Language : %s
                %n""", trainee.getId(),
                trainee.getName(),trainee.getLanguage());
        System.out.println("Company : ");
        Company company = trainee.getCompany();
        company.printDetails();
    }

}

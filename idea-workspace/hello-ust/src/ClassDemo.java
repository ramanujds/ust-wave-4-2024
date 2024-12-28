import java.util.Scanner;

class ClassDemo {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.createPerson();
        p1.print();

        Person p2 = new Person();
        p2.createPerson("Harsh",27,"Chennai");
        p2.print();

    }
}

class Person{
    String name;
    int age;
    String location;

    void print(){
        System.out.println("Name : "+ name+" | Age : "+age+" | Location : "+location);
    }
    void createPerson(String name, int age, String location){
        this.name = name;
        this.age = age;
        this.location = location;
    }

    void createPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = scanner.nextLine();
        System.out.println("Enter age : ");
        age = scanner.nextInt();
        System.out.println("Enter Location : ");
        location =   scanner.next() + scanner.nextLine();
    }
    boolean isAdult(){
        return age >= 18;
    }
}
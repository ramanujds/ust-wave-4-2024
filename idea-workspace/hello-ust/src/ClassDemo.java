class ClassDemo {

    public static void main(String[] args) {

        Person p1 = new Person();
        // Read values from keyboard

        p1.createPerson("Karan",25,"Bangalore");

        p1.print();

        System.out.println("Adult : "+p1.isAdult());

        Person p2 = new Person();
        p2.createPerson("Javed",16,"Trivandrum");

        p2.print();
        System.out.println("Adult : "+p2.isAdult());


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

    boolean isAdult(){
        return age >= 18;
    }

}
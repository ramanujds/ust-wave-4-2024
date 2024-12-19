
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float value = 10.5f;
        char ch = 'a';
        boolean flag = true;

        String name;

        // Reading input from the user

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your name : ");
        name = scan.nextLine();


        System.out.println("Hello, I am " + name);

//        System.out.println("""
//                Hello, I am %s
//                """.formatted(name));


    }
}
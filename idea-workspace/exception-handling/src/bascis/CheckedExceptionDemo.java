package bascis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("abc.txt");

            Scanner scanner = new Scanner(file);

            System.out.println(scanner.nextLine());
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }

    }

}

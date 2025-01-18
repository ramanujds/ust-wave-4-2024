package charstream;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("hello.txt");
            Scanner scanner = new Scanner(fileReader);
            System.out.println(scanner.nextLine());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}

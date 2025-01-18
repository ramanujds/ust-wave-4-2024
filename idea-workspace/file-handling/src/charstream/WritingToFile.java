package charstream;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("file1.txt",true);
            fileWriter.append("\nwe will go for a party");
            fileWriter.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }


    }
}

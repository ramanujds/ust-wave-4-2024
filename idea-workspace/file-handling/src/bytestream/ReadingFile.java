package bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFile {

    public static void main(String[] args) {

        try {
            FileInputStream inputStream = new FileInputStream("hello.txt");
            int ch;
            while ((ch = inputStream.read()) != -1){
                System.out.print((char) ch);
            }

        }
       catch (IOException ex){
           System.out.println(ex.getMessage());
       }


    }

}

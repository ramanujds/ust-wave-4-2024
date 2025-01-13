import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(10);

        numbers.add(10);

        numbers.add(50);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);

        numbers.remove((Object)10);

        for(int num:numbers){
            System.out.println(num);
        }




    }
}
package map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String,String> states = new HashMap<>();

        states.put("Maharashtra","Mumbai");
        states.put("Karnataka","Bengaluru");
        states.put("West Bengal","Kolkata");
        states.put("Kerala","Trivandrum");



//        String state = "Kerala";
//        String capital = states.get(state);
//
//        System.out.println(state+" : "+capital);

        for (String state:states.keySet()){
            System.out.println(state+" : "+states.get(state));
        }

    }

}

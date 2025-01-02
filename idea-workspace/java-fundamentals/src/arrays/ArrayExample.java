package arrays;

import java.util.Arrays;
import java.util.Locale;

public class ArrayExample {

    public static void main(String[] args) {

        String[] names = {"Akash","Rogan","Sachin","Andrea","Vivek"};

//        names[0] = "Akash";
//        names[1] = "Rogan";
//        names[2] = "Sachin";
//        names[3] = "Andrea";
//        names[4] = "Vivek";


        for (int i=0; i<names.length; i++){
            names[i]=names[i].toUpperCase();
        }


        for(String name : names){
            System.out.println(name);
        }

//       var newArray =  Arrays.stream(names).map(String::toUpperCase).toArray();
//        for(String name : names){
//            System.out.println(name);
//        }

    }

}

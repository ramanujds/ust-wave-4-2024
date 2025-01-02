package arrays;

import java.util.Arrays;

public class ArrayMax {


    public static void main(String[] args) {

        int []arr = {10,4,6,100,7,2,200,3};

        Arrays.sort(arr);

        int max = arr[arr.length-1];

//        for(int value:arr){
//            if(value>max){
//                max = value;
//            }
//        }


        System.out.println("Max = "+max);

        // write a code to find an element based on an index
        // 2 => 6

    }

}

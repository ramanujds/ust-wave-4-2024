package bascis;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Hello, we are trying a divide operation");
        int[] arr = {10,0};

        if(arr[1] != 0){
            int result = arr[0] / arr[1];
            System.out.println("Division Done");
            System.out.println("Result = " + result);
        }




        System.out.println("Do you want to do something else?(y/n)");
        char ch = new Scanner(System.in).next().charAt(0);

    }

}

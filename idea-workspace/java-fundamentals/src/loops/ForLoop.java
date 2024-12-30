package loops;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        // input positive numbers one by one from the user and get the sum
        // stop taking more inputs if zero or negative numbers entered

        int num;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Input a number");
            num = scanner.nextInt();
            if(num<0){
                continue;
            }
            if (num==0){
                System.out.println("Counting and Returning...");
                break;
            }
            sum += num;
        }
        System.out.println("Sum = "+sum);
        //continue
    }

}

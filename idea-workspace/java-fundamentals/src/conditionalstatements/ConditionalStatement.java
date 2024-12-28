package conditionalstatements;

import java.time.LocalDate;
import java.util.Scanner;

public class ConditionalStatement {


    public static void main(String[] args) {

        // git an integer(1-7) and you need to print the corresponding day of the week
        // 1 - Monday
        // 2 - Tuesday
        // 100 - Invalid day

        LocalDate today = LocalDate.now();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a day in number : ");
        int day = scan.nextInt();

        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day";
        };

        System.out.println(dayName);


    }


}

package day12_switch_statements;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number that represents day of week / 1-7: ");
        int dayNum = input.nextInt();

        String day = "";

        switch (dayNum) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
            case 7:
                day = "Weekend";
                break;
            default:
                day = "No valid number that represents day of week!";
                break;
        }

        System.out.println(day);
    }
}
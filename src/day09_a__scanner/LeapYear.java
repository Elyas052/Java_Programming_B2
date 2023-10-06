package day09_a__scanner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a year: ");
        /*
        int year = input.nextInt();
        boolean isLeapYear = year % 4 == 0;
        System.out.println("It is a Leap Year: " + isLeapYear);
        */

        int year = input.nextInt();
        boolean isCovidYear = 2019 <= year && year < 2022;  // Hopefully not 2022 :)
        System.out.println(year + " was one of Covid years: " + isCovidYear);

    }
}

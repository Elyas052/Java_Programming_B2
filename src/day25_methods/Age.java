package day25_methods;

import java.util.Scanner;

/*
Make a method that calculates age and prints it.
Take the birth year as a parameter.
 */

public class Age {

    // age, calculateAge, getAge --> Methods name.
    public static void getAge(int year) {

        // Can you handle if a user gives you something invalid - anything more than 2023?
        if (year > 2023) {
            System.out.println("You have born yet");
        } else {
            System.out.println("Your age is " + (2023 - year));
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        getAge(birthYear);

    }
}

package day11_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String result = "";

        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = "" + number;
        }

        System.out.println(result);


        System.out.println("-------");

        // This is made in this way just to explain else-if execution flow
        if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = "" + number;
        }

        System.out.println(result);
    }
}
package day17_loops;

import java.util.Scanner;

public class GuessNumber {

    /*
    There is a number predefined
    1-100

    We want the user to guess.

    80

    -> 50
        50 is too small.

    -> 90
        90 is too big.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int secretNumber = 80;
        int userGuess;
        int attempts = 0;

        do {
            System.out.println("Guess your number");
            userGuess = scan.nextInt();
            attempts++;

            // This if a statement checks for valid inputs of number from 1 to 100
            if (userGuess > 0 && userGuess <= 100) {

                // this an if statement tell the user how close the guess is to the number
                // this is a repeated action
                if (userGuess == 80) {
                    System.out.println("Good guess! The number was " + secretNumber);
                } else if (userGuess < 80) {
                    System.out.println(userGuess + " is too small.");
                } else if (userGuess > 80) {
                    System.out.println(userGuess + " is too big.");
                }
            } else {
                System.out.println("Invalid number, needs to be between 1-100");
            }

        } while (userGuess != 80);

        // different if statement that gives some feedback based on the guesses / attempts
        if (attempts <= 2) {
            System.out.println("really good guess");
        } else if (attempts <= 4) {
            System.out.println("still good guess");
        } else {
            System.out.println("a lot of guesses but you got it.");
        }

    }
}

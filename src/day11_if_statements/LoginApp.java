package day11_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {

        int myPinСod = 1234;
        int mySSN = 8213;

        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to ATM! \n\tPlease, enter your pin-code: ");
        int enteredPinСod = input.nextInt();

        System.out.print("\tPlease, enter last 4 digits of your SSN: ");
        int enteredSSN = input.nextInt();

        String message = "";
        if (enteredPinСod == myPinСod && enteredSSN == mySSN) {
            message = "\n\tAuthentication successful";
            //System.out.println("\n\tAuthentication successful");
        } else {
            message = "\n\tAuthentication failed";
            //System.out.println("\n\tAuthentication failed");

            if (enteredPinСod != myPinСod) {
                message = message + "\t\tInvalid Pin code";
                //System.out.println("\t\tInvalid Pin code");
            }

            if (enteredSSN != mySSN) {
                message = message + "\t\tInvalid Pin code";
                //System.out.println("\t\tInvalid SSN");
            }
            System.out.println(message);

        }
    }
}

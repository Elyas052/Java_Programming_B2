package day13_string;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        System.out.print("Pick Operator: \n\t+\n\t-\n\t*\n\t/\n\t%\n\n\tSelect: ");
        String operator = input.next();

        int result = 0; // We just declared a variable and set it at the default value 0
        String message = "";
        boolean runOrNotRun = true;

        switch (operator) {
            case "+":
            case "plus":
                result = num1 + num2;
                break;
            case "-":
            case "minus":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                message = "Invalid Operator";
                runOrNotRun = false;
                break;
        }

        // If (if default is run, do not run this if statement)
        // (operator equals + || operator equals - || operator equals * || .............) ---- >  this will work as well.
        if (runOrNotRun) {
            System.out.println("\nYou entered numbers which are " + num1 + " and " + num2 + "\nWith the " + operator + " operator you selected, the result is: " + result);
        } else {
            System.out.println(message);
        }

    }
}

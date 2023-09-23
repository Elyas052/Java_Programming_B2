package day12_switch_statements;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Initializing an object.

        double price = 0;
        int calories = 0;

        boolean isNotValid = true;

        System.out.print("What size of drink do you want? ");
        String size = input.next();

        switch (size) {
            case "tall":
                price = 2.50;
                calories = 100;
                break;

            case "grande":
                price = 4.00;
                calories = 150;
                break;

            case "venti":
                price = 4.50;
                calories = 200;
                break;

            default:
                System.out.println("We do not have the size");
                isNotValid = false;

        }

        if (isNotValid) {
            System.out.println("You order for a " + size + " coffee is $" + price + " and has " + calories + " calories.");
        }
    }
}
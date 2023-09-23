package day12_switch_statements;

import java.util.Scanner;

public class ArmyQualify {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Are you a citizen? true/false: ");
        boolean isCitizen = input.nextBoolean();

        System.out.print("Are you a resident? true/false: ");
        boolean isResident = input.nextBoolean();

        System.out.print("Do you have a high school diploma? true/false: ");
        boolean hasDiploma = input.nextBoolean();

        System.out.print("How old are you? ");
        int age = input.nextInt();

        if (isCitizen || isResident) {
            System.out.println("You passed first qualification");

            if (age >= 18 && age <= 35) {
                System.out.println("You passed 2nd qualification as well.");

                if (hasDiploma) {
                    System.out.println("You have passed final qualification. Congrats!");
                } else {
                    System.out.println("You must have a diploma.");
                }

            } else {
                System.out.println("You must be between 18 and 35 years old");
            }

        } else {
            System.out.println("You must be a citizen or resident");
        }
    }
}
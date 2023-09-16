package day09_b__if_statements;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Are you hungry? Enter true/false: ");
        boolean isHungry = input.nextBoolean();

        if (isHungry) {
            System.out.println("You are hungry, so I will order some food");
        } else {
            System.out.println("Great, go practice Java");
        }
    }
}
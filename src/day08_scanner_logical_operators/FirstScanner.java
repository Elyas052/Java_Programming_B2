package day08_scanner_logical_operators;

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = input.nextInt();
        System.out.println("This is your number " + number);

    }
}

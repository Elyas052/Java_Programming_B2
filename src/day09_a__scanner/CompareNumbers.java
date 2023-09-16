package day09_a__scanner;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = input.nextInt();
        System.out.println("Enter number 2");
        int num2 = input.nextInt();

        System.out.println("The numbers are equal: " + (num1 == num2));
    }
}
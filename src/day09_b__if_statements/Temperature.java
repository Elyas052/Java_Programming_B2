package day09_b__if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temp = key.nextInt();  // Here we are dynamically getting the value from user each time
        // Int temp = 50; // Here we are manually changing the value. It is kind of HARD CODED

        //boolean result = temps >= 70;
        //if (result) {

        if (temp >= 70) {
            System.out.println("It is a nice day");
            System.out.println("Go outside, but with your laptop to code java ");
        } else {
            System.out.println("It is too cold");
            System.out.println("Code more Java");
        }
    }
}
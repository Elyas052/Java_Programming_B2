package day09_a__scanner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        byte age = input.nextByte();

        System.out.print("Enter your favorite number: ");
        long favoriteNumber = input.nextLong();

        input.nextLine();  // this one handles the ENTER key that comes from previous
        System.out.print("Enter your favorite book: ");
        String book = input.nextLine();

        System.out.println("Your age: " + age);
        System.out.println("Your favorite number: " + favoriteNumber);
        System.out.println("Your book name: " + book);

    }
}

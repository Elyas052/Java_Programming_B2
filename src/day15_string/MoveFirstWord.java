package day15_string;

import java.util.Scanner;

public class MoveFirstWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine().trim();

        int spaceIndex = sentence.indexOf(' '); // (" ")

        String firstWord = sentence.substring(0, spaceIndex);

        String result = sentence.substring(spaceIndex + 1) + " " + firstWord;
        // String result = sentence.substring(spaceIndex).trim() + " " + firstWord;

        System.out.println(result);
    }
}
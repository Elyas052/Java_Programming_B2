package day15_string;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three words:");
        String wordOne = input.next().toLowerCase();
        String wordTwo = input.next().toLowerCase();
        String wordThree = input.next().toLowerCase();

        int oneLen = wordOne.length();
        int twoLen = wordTwo.length();
        int threeLen = wordThree.length();

        String msg = "";

        // We use word length to find the largest word with a
        if (wordOne.contains("a") && oneLen > twoLen && oneLen > threeLen) {
            msg = wordOne + " is the biggest with a";
        } else if (wordTwo.contains("a") && twoLen > oneLen && twoLen > threeLen) {
            msg = wordTwo + " is the biggest with a";
        } else if (wordThree.contains("a") && threeLen > oneLen && threeLen > twoLen) {
            msg = wordThree + " is the biggest with a";
        } else {
            msg = "No single largest word with a";
        }
        System.out.printf(msg);

    }
}

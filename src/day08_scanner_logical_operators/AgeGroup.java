package day08_scanner_logical_operators;

public class AgeGroup {
    public static void main(String[] args) {

        int age = 65; // We have initialized the age variable and assigned a value 10 to it.

        boolean isKid = age <= 13;
        boolean isSenior = age >= 65;

        System.out.println("\nYou are a kid: " + isKid);
        System.out.println("You are a senior: " + isSenior);
    }
}

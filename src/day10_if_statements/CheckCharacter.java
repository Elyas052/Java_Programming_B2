package day10_if_statements;

public class CheckCharacter {
    public static void main(String[] args) {

        char letter = 'a';

        if ('A' <= letter && letter <= 'Z') {
            System.out.println("\nUPPERCASE");
        }

        if ('a' <= letter && letter <= 'z') {
            System.out.println("\nlowercase");
        }

    }
}

package day03_comments_escape_sequence;

public class Quote {
    public static void main(String[] args) {

        System.out.println("I like \"Java\" programming");
        System.out.println("I like ''Java'' programming");
        System.out.println("I like \'Java\' programming");

        // Now I can print two backward slashes?
        System.out.println("abc\\\\def\n");

        /*
        Q: How can you output this:
        I like "java" programming
        */

        System.out.println("I like \"java\" programming");
        System.out.println("\"This is a quote\"");

        /*
            The first quote is before java printing the text,
            The second quote is to print the " quotation mark in the console
         */

        // I want to print backslash
        System.out.println("abc\\def"); // this will print one backslash

        /*
            The first backslash is for the syntax of escape characters,
            The second backslash is for the backslash character to be output
         */

        System.out.println("abc\\\\def"); // this will print two backslashes
        System.out.println("abc\\\"def");
        System.out.println("abc/def");

    }
}
